//Copyright 2017-2018 Baidu Inc.
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http: //www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

package filter

import (
	"github.com/astaxie/beego"
	"rasp-cloud/models"
	"net/http"
	"github.com/astaxie/beego/context"
)

func init() {
	beego.InsertFilter("/v1/agent/*", beego.BeforeRouter, authAgent)
	beego.InsertFilter("/v1/api/*", beego.BeforeRouter, authApi)
}

func authAgent(ctx *context.Context) {
	appId := ctx.Input.Header("X-OpenRASP-AppID")
	app, err := models.GetAppById(appId)
	if appId == "" || err != nil || app == nil {
		ctx.Output.JSON(map[string]interface{}{
			"status": http.StatusUnauthorized, "description": http.StatusText(http.StatusUnauthorized)},
			false, false)
	}
}

func authApi(ctx *context.Context) {
	cookie := ctx.GetCookie(models.AuthCookieName)
	if has, err := models.HasCookie(cookie); !has || err != nil {
		token := ctx.Input.Header("RASP-AUTH-ST-TOKEN")
		if has, err = models.HasTokent(token); !has || err != nil {
			ctx.Output.JSON(map[string]interface{}{
				"status": http.StatusUnauthorized, "description": http.StatusText(http.StatusUnauthorized)},
				false, false)
			panic("")
		}
	}
}
package org.linlinjava.litemall.admin.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HTime
 * @Description:
 * @Date: 2019/2/21.
 */
@RestController
@RequestMapping("/admin/swagger")
@Validated
public class AdminSwaggerController {

	@RequiresPermissions("admin:swagger:view")
	@RequiresPermissionsDesc(menu={"系统管理" , "文档管理"}, button="查看")
	@GetMapping("/view")
	public String view()
	{
		return "redirect:/swagger-ui.html";
	}

}

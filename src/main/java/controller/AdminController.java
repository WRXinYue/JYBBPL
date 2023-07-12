package controller;

import entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import common.Result;
import controller.dto.LoginDTO;
import controller.request.LoginRequest;
import service.IAdminService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IAdminService adminService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginRequest request) {
        LoginDTO login = adminService.login(request);
        return Result.success(login);
    }

    @PostMapping("/save")
    public Result save(@RequestBody Admin admin) {
        adminService.save(admin);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Admin admin) {
        adminService.update(admin);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        adminService.deleteById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Admin admin = adminService.geyById(id);
        return Result.success(admin);
    }

    @GetMapping("/list")
    public Result list() {
        // 在 listUser 按住 ctrl + alt + b 进入实现类
        List<Admin> users = adminService.list();
        return Result.success(users);
    }

//    @GetMapping("/page")
//    public Result page(AdminPageRequest pageRequest) {
//        return Result.success(adminService.page(pageRequest));
//    }

}

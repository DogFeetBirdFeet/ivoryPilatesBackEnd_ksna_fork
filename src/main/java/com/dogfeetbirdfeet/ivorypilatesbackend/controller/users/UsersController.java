package com.dogfeetbirdfeet.ivorypilatesbackend.controller.users;

import com.dogfeetbirdfeet.ivorypilatesbackend.dto.searchdto.CusSearchDto;
import com.dogfeetbirdfeet.ivorypilatesbackend.service.users.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    
    /**
     * 회원목록검색
     * @author swo
     * @param name 고객명, contact 연락처, flag 조회flag
     * @return 계정 정보
     */
    @GetMapping("/search")
    public ResponseEntity<List<CusSearchDto>> getCusSearch(@RequestParam String name, @RequestParam String contact, @RequestParam String flag) {
        return ResponseEntity.ok(usersService.getCusSearch(name, contact, flag));
    }
}

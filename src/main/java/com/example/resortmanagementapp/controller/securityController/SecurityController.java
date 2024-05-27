//package com.example.resortmanagementapp.controller.securityController;
//
//import com.example.resortmanagementapp.config.JwtUtility;
//import com.example.resortmanagementapp.model.employee.Account;
//import com.example.resortmanagementapp.dto.request.LoginRequest;
//import com.example.resortmanagementapp.dto.response.JwtResponse;
//import com.example.resortmanagementapp.service.IAccountService;
//import com.example.resortmanagementapp.service.IRoleService;
//import com.example.resortmanagementapp.service.impl.AccountDetailsImpl;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("api/public")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//public class SecurityController {
//
//    @Autowired
//    private IRoleService iRoleService;
//    @Autowired
//    private JwtUtility jwtUtility;
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private IAccountService iAccountService;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtility.generateJwtToken(loginRequest.getUsername());
//        AccountDetailsImpl userDetails = (AccountDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        List<String> roles = userDetails.getAuthorities().stream()
//                .map(GrantedAuthority::getAuthority)
//                .collect(Collectors.toList());
//
//        Account account = iAccountService.findAllByUsername(loginRequest.getUsername());
//        return ResponseEntity.ok(
//                new JwtResponse(
//                        jwt,
//                        userDetails.getUsername(),
//                        roles)
//        );
//
////        thông tin trả về khi login vs jwt
//
//
//    }
//}

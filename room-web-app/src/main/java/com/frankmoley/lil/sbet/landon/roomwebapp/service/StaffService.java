package com.frankmoley.lil.sbet.landon.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import com.frankmoley.lil.sbet.landon.roomwebapp.data.StaffRepository;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.Position;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}
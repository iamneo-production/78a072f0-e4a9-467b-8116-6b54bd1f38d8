package com.examly.springapp.service;

import com.examly.springapp.model.Admin;
import com.examly.springapp.controller.ExistingAdmin;

public interface AdminService{
public String register(Admin a);
public Admin  Login(ExistingAdmin a);


}

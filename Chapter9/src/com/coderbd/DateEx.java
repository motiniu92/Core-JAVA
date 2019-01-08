/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.Date;

/**
 *
 * @author User
 */
public class DateEx {
    public static void main(String[] args) {
        System.out.println(new Date());
        Date date=new Date();
        System.out.println("Time in ms:"+date.getTime());
        System.out.println("Date in ms:"+date.getDate());
        System.out.println("Day in ms:"+date.getDay());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bailuyentap_11.ExTwo;
public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification();

        // dùng Email
        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello via Email");

        // đổi sang SMS
        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello via SMS");
    }
}
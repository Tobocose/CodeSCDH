/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.codeS.Service;

import java.util.ArrayList;
import poly.DienThoaiModel;

/**
 *
 * @author Acer
 */
public class modelService {
    public ArrayList<DienThoaiModel>lstdt = new ArrayList<>();
    
    public void fakedata(){
        lstdt.add(new DienThoaiModel("Iphone 15ProMax", 29.900000, "Apple", "Sliver", "512GB", "3500mAh", 200, "Đang sale"));
        lstdt.add(new DienThoaiModel("SamSung GalaXy S24 ultra", 25.900000, "SamSung", "Blue", "512GB", "4000mAh", 100, "đang Sale"));
        lstdt.add(new DienThoaiModel("OPPO Reno 11F", 5.300000, "OPPO", "Purple", "512GB", "1500mAh", 300, "Đang Sale"));
    }
    
    
    public boolean adddt(DienThoaiModel dt){
        try {
            lstdt.add(dt);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deletedt(int index){
        try {
            lstdt.remove(index);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean updatedt(int index,DienThoaiModel dt){
        try {
            lstdt.set(index, dt);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

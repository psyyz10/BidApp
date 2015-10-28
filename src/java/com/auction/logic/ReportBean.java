/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.dao.ReportDAO;
import com.auction.entity.Report;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */


public class ReportBean {
    ReportDAO rdao = new ReportDAO();
    
    public <T> int save(T obj) {
        return rdao.save(obj);
    }
    
    public List<Report> queryAll(){
        return rdao.queryAll();
    }
    
    public int del(int reportId){
        return rdao.del(reportId);
    }
    
    public List<Report> queryReportByReportId(Integer ReportID){
        return rdao.queryReportByReportId(ReportID);
    }
    
    public List<Report> queryReportByReceiverId(Integer receiverID){
        return rdao.queryReportByReceiverId(receiverID);
    }
}

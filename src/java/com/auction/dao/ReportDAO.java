/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Report;
import com.auction.entity.Report;
import com.auction.factory.IDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class ReportDAO implements IDAO{
    public int delete(Integer id) {
        String sql = "";
        return update(sql);
    }
    
    public <T> int save(T obj) {
        Report report = (Report)obj;
        String sql = "insert into Report ("
                + "SenderID, ReceiverID, "
                + "Comments) "
                + "values("
                + report.getSenderId() + ", "
                + report.getReceiverId() + ",' "
                + report.getComments() + "');";
        return update(sql);
    }
    
    public int del(int reportId)
    {
        String sql="delete from Report where reportid='"
                +reportId+"';";
        return update(sql);
    }
    
    public List<Report> queryAll(){
        String sql="select * from Report;";
        return query(sql);
    }
    
    public List<Report> queryReportByReceiverId(Integer receiverID)
    {
        String sql="select * from Report where ReceiverID ="+receiverID+";";
        return query(sql);
    }
    
    public List<Report> queryReportByReportId(Integer reportId)
    {
        String sql="select * from Report where ReportId ="+reportId+";";
        return query(sql);
    }
    
    private List<Report> query(String sql)
    {
        DbManager db=new DbManager();
        ResultSet rs=null;
        List<Report> list=new ArrayList<Report>();
        rs = db.getRs(sql);
        try {
            while(rs.next())
            {
                Report report = new Report();
                report.setComments(rs.getString("Comments"));
                report.setReportId(rs.getInt("ReportID"));
                report.setReceiverId(rs.getInt("ReceiverId"));
                report.setSenderId(rs.getInt("SenderId"));
                report.setTimeSent(rs.getString("TimeSent"));
                
                list.add(report);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            db.destory();
        }
        return list;
    }
    
    private int update(String sql)
    {
        DbManager db=new DbManager();
        return db.updb(sql);
    }
}

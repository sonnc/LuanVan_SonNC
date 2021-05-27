package app.qlcv.entities;
// Generated Feb 20, 2021 4:59:14 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TkWsAttachments generated by hbm2java
 */
public class TkWsAttachments  implements java.io.Serializable {


     private int id;
     private String createBy;
     private String lastUpdateBy;
     private Date createDate;
     private Date lastUpdateDate;
     private String fileName;
     private String fileLink;
     private String fileStatus;
     private Integer taskId;
     private Integer taskListId;

    public TkWsAttachments() {
    }

	
    public TkWsAttachments(int id) {
        this.id = id;
    }
    public TkWsAttachments(int id, String createBy, String lastUpdateBy, Date createDate, Date lastUpdateDate, String fileName, String fileLink, String fileStatus, Integer taskId, Integer taskListId) {
       this.id = id;
       this.createBy = createBy;
       this.lastUpdateBy = lastUpdateBy;
       this.createDate = createDate;
       this.lastUpdateDate = lastUpdateDate;
       this.fileName = fileName;
       this.fileLink = fileLink;
       this.fileStatus = fileStatus;
       this.taskId = taskId;
       this.taskListId = taskListId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCreateBy() {
        return this.createBy;
    }
    
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public String getLastUpdateBy() {
        return this.lastUpdateBy;
    }
    
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileLink() {
        return this.fileLink;
    }
    
    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
    public String getFileStatus() {
        return this.fileStatus;
    }
    
    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }
    public Integer getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
    public Integer getTaskListId() {
        return this.taskListId;
    }
    
    public void setTaskListId(Integer taskListId) {
        this.taskListId = taskListId;
    }




}


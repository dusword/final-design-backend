package com.dusword.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column(name = "errmsg")
    private String errmsg;
//    @Column(name = "ErrCode")
    private Integer errcode;
//    @Column(name = "TotalRowNum")
    private Integer totalrownum;
//    @Column(name = "RowNum")
    private Integer rownum;
//    @Column(name = "Reserve")
    private String reserve;
//    @Column(name = "ResBindCode")
    private String resbindcode;
//    @Column(name = "IsBind")
    private Integer isbind;
//    @Column(name = "IsCamInComplexIPC")
    private Integer iscamincomplexipc;
//    @Column(name = "ResAttribute")
    private Integer resattribute;
//    @Column(name = "IsSuperIPC")
    private Integer issuperipc;
//    @Column(name = "OrgName")
    private String orgname;
//    @Column(name = "ResCode")/
    private String rescode;
//    @Column(name = "ResExtStatus")
    private Integer resextstatus;
//    @Column(name = "OrgCode")
    private String orgcode;
//    @Column(name = "ResStatus")
    private Integer resstatus;
//    @Column(name = "ResIsBeShare")
    private Integer resisbeshare;
//    @Column(name = "ResIsForeign")
    private Integer resisforeign;
//    @Column(name = "StreamNum")
    private Integer streamnum;
//    @Column(name = "ResName")
    private String resname;
//    @Column(name = "ResSubType")
    private Integer ressubtype;
//    @Column(name = "ResType")
    private Integer restype;
//    @Column(name = "HasBrdSubRes")
    private Integer hasbrdsubres;
//    @Column(name = "DevEncodeSet")
    private Integer devencodeset;
//    @Column(name = "VoiceStatus")
    private Integer voicestatus;
//    @Column(name = "SubTypeOfSubType")
    private Integer subtypeofsubtype;

}

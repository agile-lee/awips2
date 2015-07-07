/**
* This software was developed and / or modified by Raytheon Company,
* pursuant to Contract DG133W-05-CQ-1067 with the US Government.
* 
* U.S. EXPORT CONTROLLED TECHNICAL DATA
* This software product contains export-restricted data whose
* export/transfer/disclosure is restricted by U.S. law. Dissemination
* to non-U.S. persons whether in the United States or abroad requires
* an export license or other authorization.
* 
* Contractor Name:        Raytheon Company
* Contractor Address:     6825 Pine Street, Suite 340
*                         Mail Stop B8
*                         Omaha, NE 68106
*                         402.291.0100
* 
* See the AWIPS II Master Rights File ("Master Rights File.pdf") for
* further licensing information.
**/
package com.raytheon.uf.common.dataplugin.shef.tables;
// default package
// Generated Oct 17, 2008 2:22:17 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Riverstat generated by hbm2java
 * 
 * 
 * <pre>
 * 
 * SOFTWARE HISTORY
 * Date         Ticket#    Engineer    Description
 * ------------ ---------- ----------- --------------------------
 * Oct 17, 2008                        Initial generation by hbm2java
 * Aug 19, 2011      10672     jkorman Move refactor to new project
 * Oct 07, 2013       2361     njensen Removed XML annotations
 * Jul 06, 2015      14104     lbousaidi increased length of gsno column.
 * 
 * </pre>
 * 
 * @author jkorman
 * @version 1.1
 */
@Entity
@Table(name = "riverstat")
@com.raytheon.uf.common.serialization.annotations.DynamicSerialize
public class Riverstat extends com.raytheon.uf.common.dataplugin.persist.PersistableDataObject implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String lid;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Location location;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String primaryPe;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double bf;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double cb;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double da;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double responseTime;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double thresholdRunoff;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double fq;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double fs;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String gsno;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String level;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double mile;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double pool;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String por;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String rated;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double lat;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double lon;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String remark;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Date rrevise;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String rsource;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String stream;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String tide;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String backwater;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String vdatum;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double actionFlow;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double wstg;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double zd;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Date ratedat;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String usgsRatenum;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Integer uhgdur;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String useLatestFcst;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Rpffcstpoint> rpffcstpoints = new HashSet<Rpffcstpoint>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Flood> floods = new HashSet<Flood>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Ratingshift> ratingshifts = new HashSet<Ratingshift>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Rating> ratings = new HashSet<Rating>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Refer> refers = new HashSet<Refer>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Floodcat> floodcats = new HashSet<Floodcat>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Datum> datums = new HashSet<Datum>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Benchmark> benchmarks = new HashSet<Benchmark>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Fcstptservice> fcstptservices = new HashSet<Fcstptservice>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Lowwater> lowwaters = new HashSet<Lowwater>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Crest> crests = new HashSet<Crest>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Floodstmt> floodstmts = new HashSet<Floodstmt>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Pub> pubs = new HashSet<Pub>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Descrip> descrips = new HashSet<Descrip>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Unitgraph> unitgraphs = new HashSet<Unitgraph>(0);

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Set<Hgstation> hgstations = new HashSet<Hgstation>(0);

    public Riverstat() {
    }

    public Riverstat(String lid, Location location) {
        this.lid = lid;
        this.location = location;
    }

    public Riverstat(String lid, Location location, String primaryPe,
            Double bf, Double cb, Double da, Double responseTime,
            Double thresholdRunoff, Double fq, Double fs, String gsno,
            String level, Double mile, Double pool, String por, String rated,
            Double lat, Double lon, String remark, Date rrevise,
            String rsource, String stream, String tide, String backwater,
            String vdatum, Double actionFlow, Double wstg, Double zd,
            Date ratedat, String usgsRatenum, Integer uhgdur,
            String useLatestFcst, Set<Rpffcstpoint> rpffcstpoints,
            Set<Flood> floods, Set<Ratingshift> ratingshifts,
            Set<Rating> ratings, Set<Refer> refers, Set<Floodcat> floodcats,
            Set<Datum> datums, Set<Benchmark> benchmarks,
            Set<Fcstptservice> fcstptservices, Set<Lowwater> lowwaters,
            Set<Crest> crests, Set<Floodstmt> floodstmts, Set<Pub> pubs,
            Set<Descrip> descrips, Set<Unitgraph> unitgraphs,
            Set<Hgstation> hgstations) {
        this.lid = lid;
        this.location = location;
        this.primaryPe = primaryPe;
        this.bf = bf;
        this.cb = cb;
        this.da = da;
        this.responseTime = responseTime;
        this.thresholdRunoff = thresholdRunoff;
        this.fq = fq;
        this.fs = fs;
        this.gsno = gsno;
        this.level = level;
        this.mile = mile;
        this.pool = pool;
        this.por = por;
        this.rated = rated;
        this.lat = lat;
        this.lon = lon;
        this.remark = remark;
        this.rrevise = rrevise;
        this.rsource = rsource;
        this.stream = stream;
        this.tide = tide;
        this.backwater = backwater;
        this.vdatum = vdatum;
        this.actionFlow = actionFlow;
        this.wstg = wstg;
        this.zd = zd;
        this.ratedat = ratedat;
        this.usgsRatenum = usgsRatenum;
        this.uhgdur = uhgdur;
        this.useLatestFcst = useLatestFcst;
        this.rpffcstpoints = rpffcstpoints;
        this.floods = floods;
        this.ratingshifts = ratingshifts;
        this.ratings = ratings;
        this.refers = refers;
        this.floodcats = floodcats;
        this.datums = datums;
        this.benchmarks = benchmarks;
        this.fcstptservices = fcstptservices;
        this.lowwaters = lowwaters;
        this.crests = crests;
        this.floodstmts = floodstmts;
        this.pubs = pubs;
        this.descrips = descrips;
        this.unitgraphs = unitgraphs;
        this.hgstations = hgstations;
    }

    @Id
    @Column(name = "lid", unique = true, nullable = false, length = 8)
    public String getLid() {
        return this.lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lid", unique = true, nullable = false, insertable = false, updatable = false)
    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Column(name = "primary_pe", length = 2)
    public String getPrimaryPe() {
        return this.primaryPe;
    }

    public void setPrimaryPe(String primaryPe) {
        this.primaryPe = primaryPe;
    }

    @Column(name = "bf", precision = 17, scale = 17)
    public Double getBf() {
        return this.bf;
    }

    public void setBf(Double bf) {
        this.bf = bf;
    }

    @Column(name = "cb", precision = 17, scale = 17)
    public Double getCb() {
        return this.cb;
    }

    public void setCb(Double cb) {
        this.cb = cb;
    }

    @Column(name = "da", precision = 17, scale = 17)
    public Double getDa() {
        return this.da;
    }

    public void setDa(Double da) {
        this.da = da;
    }

    @Column(name = "response_time", precision = 17, scale = 17)
    public Double getResponseTime() {
        return this.responseTime;
    }

    public void setResponseTime(Double responseTime) {
        this.responseTime = responseTime;
    }

    @Column(name = "threshold_runoff", precision = 17, scale = 17)
    public Double getThresholdRunoff() {
        return this.thresholdRunoff;
    }

    public void setThresholdRunoff(Double thresholdRunoff) {
        this.thresholdRunoff = thresholdRunoff;
    }

    @Column(name = "fq", precision = 17, scale = 17)
    public Double getFq() {
        return this.fq;
    }

    public void setFq(Double fq) {
        this.fq = fq;
    }

    @Column(name = "fs", precision = 17, scale = 17)
    public Double getFs() {
        return this.fs;
    }

    public void setFs(Double fs) {
        this.fs = fs;
    }

    @Column(name = "gsno", length = 15)
    public String getGsno() {
        return this.gsno;
    }

    public void setGsno(String gsno) {
        this.gsno = gsno;
    }

    @Column(name = "level", length = 20)
    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Column(name = "mile", precision = 17, scale = 17)
    public Double getMile() {
        return this.mile;
    }

    public void setMile(Double mile) {
        this.mile = mile;
    }

    @Column(name = "pool", precision = 17, scale = 17)
    public Double getPool() {
        return this.pool;
    }

    public void setPool(Double pool) {
        this.pool = pool;
    }

    @Column(name = "por", length = 30)
    public String getPor() {
        return this.por;
    }

    public void setPor(String por) {
        this.por = por;
    }

    @Column(name = "rated", length = 20)
    public String getRated() {
        return this.rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    @Column(name = "lat", precision = 17, scale = 17)
    public Double getLat() {
        return this.lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Column(name = "lon", precision = 17, scale = 17)
    public Double getLon() {
        return this.lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Column(name = "remark")
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "rrevise", length = 13)
    public Date getRrevise() {
        return this.rrevise;
    }

    public void setRrevise(Date rrevise) {
        this.rrevise = rrevise;
    }

    @Column(name = "rsource", length = 20)
    public String getRsource() {
        return this.rsource;
    }

    public void setRsource(String rsource) {
        this.rsource = rsource;
    }

    @Column(name = "stream", length = 32)
    public String getStream() {
        return this.stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Column(name = "tide", length = 8)
    public String getTide() {
        return this.tide;
    }

    public void setTide(String tide) {
        this.tide = tide;
    }

    @Column(name = "backwater", length = 8)
    public String getBackwater() {
        return this.backwater;
    }

    public void setBackwater(String backwater) {
        this.backwater = backwater;
    }

    @Column(name = "vdatum", length = 20)
    public String getVdatum() {
        return this.vdatum;
    }

    public void setVdatum(String vdatum) {
        this.vdatum = vdatum;
    }

    @Column(name = "action_flow", precision = 17, scale = 17)
    public Double getActionFlow() {
        return this.actionFlow;
    }

    public void setActionFlow(Double actionFlow) {
        this.actionFlow = actionFlow;
    }

    @Column(name = "wstg", precision = 17, scale = 17)
    public Double getWstg() {
        return this.wstg;
    }

    public void setWstg(Double wstg) {
        this.wstg = wstg;
    }

    @Column(name = "zd", precision = 17, scale = 17)
    public Double getZd() {
        return this.zd;
    }

    public void setZd(Double zd) {
        this.zd = zd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ratedat", length = 13)
    public Date getRatedat() {
        return this.ratedat;
    }

    public void setRatedat(Date ratedat) {
        this.ratedat = ratedat;
    }

    @Column(name = "usgs_ratenum", length = 5)
    public String getUsgsRatenum() {
        return this.usgsRatenum;
    }

    public void setUsgsRatenum(String usgsRatenum) {
        this.usgsRatenum = usgsRatenum;
    }

    @Column(name = "uhgdur")
    public Integer getUhgdur() {
        return this.uhgdur;
    }

    public void setUhgdur(Integer uhgdur) {
        this.uhgdur = uhgdur;
    }

    @Column(name = "use_latest_fcst", length = 1)
    public String getUseLatestFcst() {
        return this.useLatestFcst;
    }

    public void setUseLatestFcst(String useLatestFcst) {
        this.useLatestFcst = useLatestFcst;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Rpffcstpoint> getRpffcstpoints() {
        return this.rpffcstpoints;
    }

    public void setRpffcstpoints(Set<Rpffcstpoint> rpffcstpoints) {
        this.rpffcstpoints = rpffcstpoints;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Flood> getFloods() {
        return this.floods;
    }

    public void setFloods(Set<Flood> floods) {
        this.floods = floods;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Ratingshift> getRatingshifts() {
        return this.ratingshifts;
    }

    public void setRatingshifts(Set<Ratingshift> ratingshifts) {
        this.ratingshifts = ratingshifts;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Rating> getRatings() {
        return this.ratings;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Refer> getRefers() {
        return this.refers;
    }

    public void setRefers(Set<Refer> refers) {
        this.refers = refers;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Floodcat> getFloodcats() {
        return this.floodcats;
    }

    public void setFloodcats(Set<Floodcat> floodcats) {
        this.floodcats = floodcats;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Datum> getDatums() {
        return this.datums;
    }

    public void setDatums(Set<Datum> datums) {
        this.datums = datums;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Benchmark> getBenchmarks() {
        return this.benchmarks;
    }

    public void setBenchmarks(Set<Benchmark> benchmarks) {
        this.benchmarks = benchmarks;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Fcstptservice> getFcstptservices() {
        return this.fcstptservices;
    }

    public void setFcstptservices(Set<Fcstptservice> fcstptservices) {
        this.fcstptservices = fcstptservices;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Lowwater> getLowwaters() {
        return this.lowwaters;
    }

    public void setLowwaters(Set<Lowwater> lowwaters) {
        this.lowwaters = lowwaters;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Crest> getCrests() {
        return this.crests;
    }

    public void setCrests(Set<Crest> crests) {
        this.crests = crests;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Floodstmt> getFloodstmts() {
        return this.floodstmts;
    }

    public void setFloodstmts(Set<Floodstmt> floodstmts) {
        this.floodstmts = floodstmts;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Pub> getPubs() {
        return this.pubs;
    }

    public void setPubs(Set<Pub> pubs) {
        this.pubs = pubs;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Descrip> getDescrips() {
        return this.descrips;
    }

    public void setDescrips(Set<Descrip> descrips) {
        this.descrips = descrips;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Unitgraph> getUnitgraphs() {
        return this.unitgraphs;
    }

    public void setUnitgraphs(Set<Unitgraph> unitgraphs) {
        this.unitgraphs = unitgraphs;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riverstat")
    public Set<Hgstation> getHgstations() {
        return this.hgstations;
    }

    public void setHgstations(Set<Hgstation> hgstations) {
        this.hgstations = hgstations;
    }

}

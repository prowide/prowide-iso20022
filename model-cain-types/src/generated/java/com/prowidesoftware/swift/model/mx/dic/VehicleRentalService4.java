
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Vehicle rental service provides detailed vehicle rental information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalService4", propOrder = {
    "cpnyNm",
    "cpnyId",
    "cpnyBizNm",
    "cpnyLglCorpNm",
    "cpnyAdr",
    "cpnyLclData",
    "cpnyCtct",
    "cpnyTp",
    "rntrNm",
    "rntrCorpNm",
    "rntrCorpIdr",
    "rntrCorpIdrAssgnr",
    "pmryDrvr",
    "addtlDrvr",
    "lltyPrgrmm",
    "summryCmmdtyId",
    "noShow",
    "rntlAgrmtNb",
    "rntlLctn",
    "adjstd",
    "pckpLctn",
    "chckOutDt",
    "chckOutTm",
    "rtrLctn",
    "chckInDt",
    "chckInTm",
    "drtn",
    "clssInvcd",
    "makeInvcd",
    "mdlInvcd",
    "regnNbInvcd",
    "clssPrvdd",
    "makePrvdd",
    "mdlPrvdd",
    "regnNbPrvdd",
    "dstncUnit",
    "odmtrStart",
    "odmtrRtr",
    "ttlDstnc",
    "freeDstnc",
    "dstncRate",
    "rntlRate",
    "insrnc",
    "addtlAmt",
    "tax",
    "prvtData",
    "ntlData"
})
public class VehicleRentalService4 {

    @XmlElement(name = "CpnyNm")
    protected String cpnyNm;
    @XmlElement(name = "CpnyId")
    protected String cpnyId;
    @XmlElement(name = "CpnyBizNm")
    protected String cpnyBizNm;
    @XmlElement(name = "CpnyLglCorpNm")
    protected String cpnyLglCorpNm;
    @XmlElement(name = "CpnyAdr")
    protected Address4 cpnyAdr;
    @XmlElement(name = "CpnyLclData")
    protected List<LocalData20> cpnyLclData;
    @XmlElement(name = "CpnyCtct")
    protected ContactBusiness2 cpnyCtct;
    @XmlElement(name = "CpnyTp")
    @XmlSchemaType(name = "string")
    protected CarRentalActivity2Code cpnyTp;
    @XmlElement(name = "RntrNm", required = true)
    protected String rntrNm;
    @XmlElement(name = "RntrCorpNm")
    protected String rntrCorpNm;
    @XmlElement(name = "RntrCorpIdr", required = true)
    protected String rntrCorpIdr;
    @XmlElement(name = "RntrCorpIdrAssgnr")
    @XmlSchemaType(name = "string")
    protected CustomerAssigner1Code rntrCorpIdrAssgnr;
    @XmlElement(name = "PmryDrvr")
    protected DriverInParty4 pmryDrvr;
    @XmlElement(name = "AddtlDrvr")
    protected List<DriverInParty4> addtlDrvr;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme4> lltyPrgrmm;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "NoShow")
    protected Boolean noShow;
    @XmlElement(name = "RntlAgrmtNb")
    protected String rntlAgrmtNb;
    @XmlElement(name = "RntlLctn")
    protected Address4 rntlLctn;
    @XmlElement(name = "Adjstd")
    protected Boolean adjstd;
    @XmlElement(name = "PckpLctn")
    protected List<Address4> pckpLctn;
    @XmlElement(name = "ChckOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chckOutDt;
    @XmlElement(name = "ChckOutTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chckOutTm;
    @XmlElement(name = "RtrLctn")
    protected Address4 rtrLctn;
    @XmlElement(name = "ChckInDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chckInDt;
    @XmlElement(name = "ChckInTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chckInTm;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "ClssInvcd")
    protected String clssInvcd;
    @XmlElement(name = "MakeInvcd")
    protected String makeInvcd;
    @XmlElement(name = "MdlInvcd")
    protected String mdlInvcd;
    @XmlElement(name = "RegnNbInvcd")
    protected String regnNbInvcd;
    @XmlElement(name = "ClssPrvdd")
    protected String clssPrvdd;
    @XmlElement(name = "MakePrvdd")
    protected String makePrvdd;
    @XmlElement(name = "MdlPrvdd")
    protected String mdlPrvdd;
    @XmlElement(name = "RegnNbPrvdd")
    protected String regnNbPrvdd;
    @XmlElement(name = "DstncUnit")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure10Code dstncUnit;
    @XmlElement(name = "OdmtrStart")
    protected String odmtrStart;
    @XmlElement(name = "OdmtrRtr")
    protected String odmtrRtr;
    @XmlElement(name = "TtlDstnc")
    protected String ttlDstnc;
    @XmlElement(name = "FreeDstnc")
    protected String freeDstnc;
    @XmlElement(name = "DstncRate")
    protected BigDecimal dstncRate;
    @XmlElement(name = "RntlRate")
    protected List<RentalRate3> rntlRate;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "AddtlAmt")
    protected List<VehicleRentalAdditionalAmount1> addtlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax44> tax;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the cpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyNm() {
        return cpnyNm;
    }

    /**
     * Sets the value of the cpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setCpnyNm(String value) {
        this.cpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyId() {
        return cpnyId;
    }

    /**
     * Sets the value of the cpnyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setCpnyId(String value) {
        this.cpnyId = value;
        return this;
    }

    /**
     * Gets the value of the cpnyBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyBizNm() {
        return cpnyBizNm;
    }

    /**
     * Sets the value of the cpnyBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setCpnyBizNm(String value) {
        this.cpnyBizNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyLglCorpNm() {
        return cpnyLglCorpNm;
    }

    /**
     * Sets the value of the cpnyLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setCpnyLglCorpNm(String value) {
        this.cpnyLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getCpnyAdr() {
        return cpnyAdr;
    }

    /**
     * Sets the value of the cpnyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public VehicleRentalService4 setCpnyAdr(Address4 value) {
        this.cpnyAdr = value;
        return this;
    }

    /**
     * Gets the value of the cpnyLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cpnyLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpnyLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the cpnyLclData property.
     */
    public List<LocalData20> getCpnyLclData() {
        if (cpnyLclData == null) {
            cpnyLclData = new ArrayList<>();
        }
        return this.cpnyLclData;
    }

    /**
     * Gets the value of the cpnyCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness2 }
     *     
     */
    public ContactBusiness2 getCpnyCtct() {
        return cpnyCtct;
    }

    /**
     * Sets the value of the cpnyCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness2 }
     *     
     */
    public VehicleRentalService4 setCpnyCtct(ContactBusiness2 value) {
        this.cpnyCtct = value;
        return this;
    }

    /**
     * Gets the value of the cpnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalActivity2Code }
     *     
     */
    public CarRentalActivity2Code getCpnyTp() {
        return cpnyTp;
    }

    /**
     * Sets the value of the cpnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalActivity2Code }
     *     
     */
    public VehicleRentalService4 setCpnyTp(CarRentalActivity2Code value) {
        this.cpnyTp = value;
        return this;
    }

    /**
     * Gets the value of the rntrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrNm() {
        return rntrNm;
    }

    /**
     * Sets the value of the rntrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setRntrNm(String value) {
        this.rntrNm = value;
        return this;
    }

    /**
     * Gets the value of the rntrCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrCorpNm() {
        return rntrCorpNm;
    }

    /**
     * Sets the value of the rntrCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setRntrCorpNm(String value) {
        this.rntrCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the rntrCorpIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrCorpIdr() {
        return rntrCorpIdr;
    }

    /**
     * Sets the value of the rntrCorpIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setRntrCorpIdr(String value) {
        this.rntrCorpIdr = value;
        return this;
    }

    /**
     * Gets the value of the rntrCorpIdrAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public CustomerAssigner1Code getRntrCorpIdrAssgnr() {
        return rntrCorpIdrAssgnr;
    }

    /**
     * Sets the value of the rntrCorpIdrAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public VehicleRentalService4 setRntrCorpIdrAssgnr(CustomerAssigner1Code value) {
        this.rntrCorpIdrAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the pmryDrvr property.
     * 
     * @return
     *     possible object is
     *     {@link DriverInParty4 }
     *     
     */
    public DriverInParty4 getPmryDrvr() {
        return pmryDrvr;
    }

    /**
     * Sets the value of the pmryDrvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverInParty4 }
     *     
     */
    public VehicleRentalService4 setPmryDrvr(DriverInParty4 value) {
        this.pmryDrvr = value;
        return this;
    }

    /**
     * Gets the value of the addtlDrvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlDrvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlDrvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverInParty4 }
     * 
     * 
     * @return
     *     The value of the addtlDrvr property.
     */
    public List<DriverInParty4> getAddtlDrvr() {
        if (addtlDrvr == null) {
            addtlDrvr = new ArrayList<>();
        }
        return this.addtlDrvr;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramme4 }
     * 
     * 
     * @return
     *     The value of the lltyPrgrmm property.
     */
    public List<LoyaltyProgramme4> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<>();
        }
        return this.lltyPrgrmm;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the noShow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShow() {
        return noShow;
    }

    /**
     * Sets the value of the noShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalService4 setNoShow(Boolean value) {
        this.noShow = value;
        return this;
    }

    /**
     * Gets the value of the rntlAgrmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntlAgrmtNb() {
        return rntlAgrmtNb;
    }

    /**
     * Sets the value of the rntlAgrmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setRntlAgrmtNb(String value) {
        this.rntlAgrmtNb = value;
        return this;
    }

    /**
     * Gets the value of the rntlLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getRntlLctn() {
        return rntlLctn;
    }

    /**
     * Sets the value of the rntlLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public VehicleRentalService4 setRntlLctn(Address4 value) {
        this.rntlLctn = value;
        return this;
    }

    /**
     * Gets the value of the adjstd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjstd() {
        return adjstd;
    }

    /**
     * Sets the value of the adjstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalService4 setAdjstd(Boolean value) {
        this.adjstd = value;
        return this;
    }

    /**
     * Gets the value of the pckpLctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pckpLctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPckpLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address4 }
     * 
     * 
     * @return
     *     The value of the pckpLctn property.
     */
    public List<Address4> getPckpLctn() {
        if (pckpLctn == null) {
            pckpLctn = new ArrayList<>();
        }
        return this.pckpLctn;
    }

    /**
     * Gets the value of the chckOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getChckOutDt() {
        return chckOutDt;
    }

    /**
     * Sets the value of the chckOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setChckOutDt(LocalDate value) {
        this.chckOutDt = value;
        return this;
    }

    /**
     * Gets the value of the chckOutTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getChckOutTm() {
        return chckOutTm;
    }

    /**
     * Sets the value of the chckOutTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setChckOutTm(OffsetTime value) {
        this.chckOutTm = value;
        return this;
    }

    /**
     * Gets the value of the rtrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getRtrLctn() {
        return rtrLctn;
    }

    /**
     * Sets the value of the rtrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public VehicleRentalService4 setRtrLctn(Address4 value) {
        this.rtrLctn = value;
        return this;
    }

    /**
     * Gets the value of the chckInDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getChckInDt() {
        return chckInDt;
    }

    /**
     * Sets the value of the chckInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setChckInDt(LocalDate value) {
        this.chckInDt = value;
        return this;
    }

    /**
     * Gets the value of the chckInTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getChckInTm() {
        return chckInTm;
    }

    /**
     * Sets the value of the chckInTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setChckInTm(OffsetTime value) {
        this.chckInTm = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the clssInvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssInvcd() {
        return clssInvcd;
    }

    /**
     * Sets the value of the clssInvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setClssInvcd(String value) {
        this.clssInvcd = value;
        return this;
    }

    /**
     * Gets the value of the makeInvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeInvcd() {
        return makeInvcd;
    }

    /**
     * Sets the value of the makeInvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setMakeInvcd(String value) {
        this.makeInvcd = value;
        return this;
    }

    /**
     * Gets the value of the mdlInvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdlInvcd() {
        return mdlInvcd;
    }

    /**
     * Sets the value of the mdlInvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setMdlInvcd(String value) {
        this.mdlInvcd = value;
        return this;
    }

    /**
     * Gets the value of the regnNbInvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNbInvcd() {
        return regnNbInvcd;
    }

    /**
     * Sets the value of the regnNbInvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setRegnNbInvcd(String value) {
        this.regnNbInvcd = value;
        return this;
    }

    /**
     * Gets the value of the clssPrvdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssPrvdd() {
        return clssPrvdd;
    }

    /**
     * Sets the value of the clssPrvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setClssPrvdd(String value) {
        this.clssPrvdd = value;
        return this;
    }

    /**
     * Gets the value of the makePrvdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakePrvdd() {
        return makePrvdd;
    }

    /**
     * Sets the value of the makePrvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setMakePrvdd(String value) {
        this.makePrvdd = value;
        return this;
    }

    /**
     * Gets the value of the mdlPrvdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdlPrvdd() {
        return mdlPrvdd;
    }

    /**
     * Sets the value of the mdlPrvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setMdlPrvdd(String value) {
        this.mdlPrvdd = value;
        return this;
    }

    /**
     * Gets the value of the regnNbPrvdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNbPrvdd() {
        return regnNbPrvdd;
    }

    /**
     * Sets the value of the regnNbPrvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setRegnNbPrvdd(String value) {
        this.regnNbPrvdd = value;
        return this;
    }

    /**
     * Gets the value of the dstncUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure10Code }
     *     
     */
    public UnitOfMeasure10Code getDstncUnit() {
        return dstncUnit;
    }

    /**
     * Sets the value of the dstncUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure10Code }
     *     
     */
    public VehicleRentalService4 setDstncUnit(UnitOfMeasure10Code value) {
        this.dstncUnit = value;
        return this;
    }

    /**
     * Gets the value of the odmtrStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdmtrStart() {
        return odmtrStart;
    }

    /**
     * Sets the value of the odmtrStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setOdmtrStart(String value) {
        this.odmtrStart = value;
        return this;
    }

    /**
     * Gets the value of the odmtrRtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdmtrRtr() {
        return odmtrRtr;
    }

    /**
     * Sets the value of the odmtrRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setOdmtrRtr(String value) {
        this.odmtrRtr = value;
        return this;
    }

    /**
     * Gets the value of the ttlDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlDstnc() {
        return ttlDstnc;
    }

    /**
     * Sets the value of the ttlDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setTtlDstnc(String value) {
        this.ttlDstnc = value;
        return this;
    }

    /**
     * Gets the value of the freeDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeDstnc() {
        return freeDstnc;
    }

    /**
     * Sets the value of the freeDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService4 setFreeDstnc(String value) {
        this.freeDstnc = value;
        return this;
    }

    /**
     * Gets the value of the dstncRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDstncRate() {
        return dstncRate;
    }

    /**
     * Sets the value of the dstncRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VehicleRentalService4 setDstncRate(BigDecimal value) {
        this.dstncRate = value;
        return this;
    }

    /**
     * Gets the value of the rntlRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rntlRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentalRate3 }
     * 
     * 
     * @return
     *     The value of the rntlRate property.
     */
    public List<RentalRate3> getRntlRate() {
        if (rntlRate == null) {
            rntlRate = new ArrayList<>();
        }
        return this.rntlRate;
    }

    /**
     * Gets the value of the insrnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrnc() {
        return insrnc;
    }

    /**
     * Sets the value of the insrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalService4 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalAdditionalAmount1 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<VehicleRentalAdditionalAmount1> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax44> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the cpnyLclData list.
     * @see #getCpnyLclData()
     * 
     */
    public VehicleRentalService4 addCpnyLclData(LocalData20 cpnyLclData) {
        getCpnyLclData().add(cpnyLclData);
        return this;
    }

    /**
     * Adds a new item to the addtlDrvr list.
     * @see #getAddtlDrvr()
     * 
     */
    public VehicleRentalService4 addAddtlDrvr(DriverInParty4 addtlDrvr) {
        getAddtlDrvr().add(addtlDrvr);
        return this;
    }

    /**
     * Adds a new item to the lltyPrgrmm list.
     * @see #getLltyPrgrmm()
     * 
     */
    public VehicleRentalService4 addLltyPrgrmm(LoyaltyProgramme4 lltyPrgrmm) {
        getLltyPrgrmm().add(lltyPrgrmm);
        return this;
    }

    /**
     * Adds a new item to the pckpLctn list.
     * @see #getPckpLctn()
     * 
     */
    public VehicleRentalService4 addPckpLctn(Address4 pckpLctn) {
        getPckpLctn().add(pckpLctn);
        return this;
    }

    /**
     * Adds a new item to the rntlRate list.
     * @see #getRntlRate()
     * 
     */
    public VehicleRentalService4 addRntlRate(RentalRate3 rntlRate) {
        getRntlRate().add(rntlRate);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public VehicleRentalService4 addAddtlAmt(VehicleRentalAdditionalAmount1 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public VehicleRentalService4 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public VehicleRentalService4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public VehicleRentalService4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}

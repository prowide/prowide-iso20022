
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Invoice related to a vehicle rental service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalInvoice3", propOrder = {
    "noShow",
    "adjstd",
    "rtrLctn",
    "chckOutDt",
    "chckOutTm",
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
    "chrg",
    "summryCmmdtyId",
    "insrnc",
    "addtlAmt",
    "tax"
})
public class VehicleRentalInvoice3 {

    @XmlElement(name = "NoShow")
    protected Boolean noShow;
    @XmlElement(name = "Adjstd")
    protected Boolean adjstd;
    @XmlElement(name = "RtrLctn")
    protected Address2 rtrLctn;
    @XmlElement(name = "ChckOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckOutDt;
    @XmlElement(name = "ChckOutTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckOutTm;
    @XmlElement(name = "ChckInDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckInDt;
    @XmlElement(name = "ChckInTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckInTm;
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
    @XmlElement(name = "Chrg")
    protected List<RentalRate1> chrg;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "AddtlAmt")
    protected List<Amount21> addtlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax41> tax;

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
    public VehicleRentalInvoice3 setNoShow(Boolean value) {
        this.noShow = value;
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
    public VehicleRentalInvoice3 setAdjstd(Boolean value) {
        this.adjstd = value;
        return this;
    }

    /**
     * Gets the value of the rtrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getRtrLctn() {
        return rtrLctn;
    }

    /**
     * Sets the value of the rtrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public VehicleRentalInvoice3 setRtrLctn(Address2 value) {
        this.rtrLctn = value;
        return this;
    }

    /**
     * Gets the value of the chckOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getChckOutDt() {
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
    public VehicleRentalInvoice3 setChckOutDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getChckOutTm() {
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
    public VehicleRentalInvoice3 setChckOutTm(XMLGregorianCalendar value) {
        this.chckOutTm = value;
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
    public XMLGregorianCalendar getChckInDt() {
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
    public VehicleRentalInvoice3 setChckInDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getChckInTm() {
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
    public VehicleRentalInvoice3 setChckInTm(XMLGregorianCalendar value) {
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
    public VehicleRentalInvoice3 setDrtn(String value) {
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
    public VehicleRentalInvoice3 setClssInvcd(String value) {
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
    public VehicleRentalInvoice3 setMakeInvcd(String value) {
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
    public VehicleRentalInvoice3 setMdlInvcd(String value) {
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
    public VehicleRentalInvoice3 setRegnNbInvcd(String value) {
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
    public VehicleRentalInvoice3 setClssPrvdd(String value) {
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
    public VehicleRentalInvoice3 setMakePrvdd(String value) {
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
    public VehicleRentalInvoice3 setMdlPrvdd(String value) {
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
    public VehicleRentalInvoice3 setRegnNbPrvdd(String value) {
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
    public VehicleRentalInvoice3 setDstncUnit(UnitOfMeasure10Code value) {
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
    public VehicleRentalInvoice3 setOdmtrStart(String value) {
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
    public VehicleRentalInvoice3 setOdmtrRtr(String value) {
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
    public VehicleRentalInvoice3 setTtlDstnc(String value) {
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
    public VehicleRentalInvoice3 setFreeDstnc(String value) {
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
    public VehicleRentalInvoice3 setDstncRate(BigDecimal value) {
        this.dstncRate = value;
        return this;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentalRate1 }
     * 
     * 
     */
    public List<RentalRate1> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<RentalRate1>();
        }
        return this.chrg;
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
    public VehicleRentalInvoice3 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
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
    public VehicleRentalInvoice3 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmt property.
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
     * {@link Amount21 }
     * 
     * 
     */
    public List<Amount21> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<Amount21>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
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
     * {@link Tax41 }
     * 
     * 
     */
    public List<Tax41> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax41>();
        }
        return this.tax;
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
     * Adds a new item to the chrg list.
     * @see #getChrg()
     * 
     */
    public VehicleRentalInvoice3 addChrg(RentalRate1 chrg) {
        getChrg().add(chrg);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public VehicleRentalInvoice3 addAddtlAmt(Amount21 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public VehicleRentalInvoice3 addTax(Tax41 tax) {
        getTax().add(tax);
        return this;
    }

}

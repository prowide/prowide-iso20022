
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Login Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRequest1", propOrder = {
    "lgnDtTm",
    "saleSftwr",
    "saleTermnlData",
    "trngMdFlg",
    "cshrId",
    "cshrLang",
    "shftNb",
    "tknReqdTp",
    "cstmrOrdrReq",
    "poiId",
    "ttlsGrpId"
})
public class LoginRequest1 {

    @XmlElement(name = "LgnDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lgnDtTm;
    @XmlElement(name = "SaleSftwr", required = true)
    protected List<PointOfInteractionComponent9> saleSftwr;
    @XmlElement(name = "SaleTermnlData")
    protected SaleTerminalData1 saleTermnlData;
    @XmlElement(name = "TrngMdFlg")
    protected Boolean trngMdFlg;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "CshrLang", required = true)
    protected String cshrLang;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "TknReqdTp")
    @XmlSchemaType(name = "string")
    protected SaleTokenScope1Code tknReqdTp;
    @XmlElement(name = "CstmrOrdrReq")
    @XmlSchemaType(name = "string")
    protected CustomerOrderRequest1Code cstmrOrdrReq;
    @XmlElement(name = "POIId")
    protected PointOfInteractionComponentIdentification1 poiId;
    @XmlElement(name = "TtlsGrpId")
    protected String ttlsGrpId;

    /**
     * Gets the value of the lgnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getLgnDtTm() {
        return lgnDtTm;
    }

    /**
     * Sets the value of the lgnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoginRequest1 setLgnDtTm(XMLGregorianCalendar value) {
        this.lgnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the saleSftwr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleSftwr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleSftwr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent9 }
     * 
     * 
     */
    public List<PointOfInteractionComponent9> getSaleSftwr() {
        if (saleSftwr == null) {
            saleSftwr = new ArrayList<PointOfInteractionComponent9>();
        }
        return this.saleSftwr;
    }

    /**
     * Gets the value of the saleTermnlData property.
     * 
     * @return
     *     possible object is
     *     {@link SaleTerminalData1 }
     *     
     */
    public SaleTerminalData1 getSaleTermnlData() {
        return saleTermnlData;
    }

    /**
     * Sets the value of the saleTermnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTerminalData1 }
     *     
     */
    public LoginRequest1 setSaleTermnlData(SaleTerminalData1 value) {
        this.saleTermnlData = value;
        return this;
    }

    /**
     * Gets the value of the trngMdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrngMdFlg() {
        return trngMdFlg;
    }

    /**
     * Sets the value of the trngMdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LoginRequest1 setTrngMdFlg(Boolean value) {
        this.trngMdFlg = value;
        return this;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoginRequest1 setCshrId(String value) {
        this.cshrId = value;
        return this;
    }

    /**
     * Gets the value of the cshrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrLang() {
        return cshrLang;
    }

    /**
     * Sets the value of the cshrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoginRequest1 setCshrLang(String value) {
        this.cshrLang = value;
        return this;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoginRequest1 setShftNb(String value) {
        this.shftNb = value;
        return this;
    }

    /**
     * Gets the value of the tknReqdTp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public SaleTokenScope1Code getTknReqdTp() {
        return tknReqdTp;
    }

    /**
     * Sets the value of the tknReqdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public LoginRequest1 setTknReqdTp(SaleTokenScope1Code value) {
        this.tknReqdTp = value;
        return this;
    }

    /**
     * Gets the value of the cstmrOrdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderRequest1Code }
     *     
     */
    public CustomerOrderRequest1Code getCstmrOrdrReq() {
        return cstmrOrdrReq;
    }

    /**
     * Sets the value of the cstmrOrdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderRequest1Code }
     *     
     */
    public LoginRequest1 setCstmrOrdrReq(CustomerOrderRequest1Code value) {
        this.cstmrOrdrReq = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification1 }
     *     
     */
    public PointOfInteractionComponentIdentification1 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification1 }
     *     
     */
    public LoginRequest1 setPOIId(PointOfInteractionComponentIdentification1 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the ttlsGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlsGrpId() {
        return ttlsGrpId;
    }

    /**
     * Sets the value of the ttlsGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoginRequest1 setTtlsGrpId(String value) {
        this.ttlsGrpId = value;
        return this;
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
     * Adds a new item to the saleSftwr list.
     * @see #getSaleSftwr()
     * 
     */
    public LoginRequest1 addSaleSftwr(PointOfInteractionComponent9 saleSftwr) {
        getSaleSftwr().add(saleSftwr);
        return this;
    }

}

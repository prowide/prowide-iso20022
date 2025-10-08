
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the securities settlement system used in a settlement process.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementSystemIdentification2", propOrder = {
    "sysId",
    "sysNm",
    "ctryOfJursdctn",
    "csdLglNm",
    "lei",
    "rspnsblPty"
})
public class SecuritiesSettlementSystemIdentification2 {

    @XmlElement(name = "SysId", required = true)
    protected String sysId;
    @XmlElement(name = "SysNm")
    protected String sysNm;
    @XmlElement(name = "CtryOfJursdctn")
    protected String ctryOfJursdctn;
    @XmlElement(name = "CSDLglNm")
    protected String csdLglNm;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "RspnsblPty")
    protected List<Contact9> rspnsblPty;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 setSysId(String value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the sysNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysNm() {
        return sysNm;
    }

    /**
     * Sets the value of the sysNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 setSysNm(String value) {
        this.sysNm = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfJursdctn() {
        return ctryOfJursdctn;
    }

    /**
     * Sets the value of the ctryOfJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 setCtryOfJursdctn(String value) {
        this.ctryOfJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the csdLglNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDLglNm() {
        return csdLglNm;
    }

    /**
     * Sets the value of the csdLglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 setCSDLglNm(String value) {
        this.csdLglNm = value;
        return this;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rspnsblPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnsblPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact9 }
     * 
     * 
     */
    public List<Contact9> getRspnsblPty() {
        if (rspnsblPty == null) {
            rspnsblPty = new ArrayList<Contact9>();
        }
        return this.rspnsblPty;
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
     * Adds a new item to the rspnsblPty list.
     * @see #getRspnsblPty()
     * 
     */
    public SecuritiesSettlementSystemIdentification2 addRspnsblPty(Contact9 rspnsblPty) {
        getRspnsblPty().add(rspnsblPty);
        return this;
    }

}

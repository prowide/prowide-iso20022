
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
 * Provides information about the global distribution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDistributionRequest1", propOrder = {
    "pradvcInd",
    "optnNb",
    "optnTp",
    "rcrdDt",
    "pmtDt",
    "sctiesMvmnt",
    "cshMvmnt"
})
public class GlobalDistributionRequest1 {

    @XmlElement(name = "PradvcInd")
    protected boolean pradvcInd;
    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "RcrdDt", required = true)
    protected DateFormat4Choice rcrdDt;
    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecurityMovement1> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement1> cshMvmnt;

    /**
     * Gets the value of the pradvcInd property.
     * 
     */
    public boolean isPradvcInd() {
        return pradvcInd;
    }

    /**
     * Sets the value of the pradvcInd property.
     * 
     */
    public GlobalDistributionRequest1 setPradvcInd(boolean value) {
        this.pradvcInd = value;
        return this;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GlobalDistributionRequest1 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public GlobalDistributionRequest1 setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public GlobalDistributionRequest1 setRcrdDt(DateFormat4Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public GlobalDistributionRequest1 setPmtDt(DateFormat4Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityMovement1 }
     * 
     * 
     */
    public List<SecurityMovement1> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<SecurityMovement1>();
        }
        return this.sctiesMvmnt;
    }

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement1 }
     * 
     * 
     */
    public List<CashMovement1> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<CashMovement1>();
        }
        return this.cshMvmnt;
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
     * Adds a new item to the sctiesMvmnt list.
     * @see #getSctiesMvmnt()
     * 
     */
    public GlobalDistributionRequest1 addSctiesMvmnt(SecurityMovement1 sctiesMvmnt) {
        getSctiesMvmnt().add(sctiesMvmnt);
        return this;
    }

    /**
     * Adds a new item to the cshMvmnt list.
     * @see #getCshMvmnt()
     * 
     */
    public GlobalDistributionRequest1 addCshMvmnt(CashMovement1 cshMvmnt) {
        getCshMvmnt().add(cshMvmnt);
        return this;
    }

}


package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides information about a corporate action election.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionElection3", propOrder = {
    "acctDtls",
    "optnTp",
    "optnNb",
    "instdUndrlygSctiesQty",
    "instdSctiesQtyToRcv",
    "propsdRate",
    "cshMvmntDtls",
    "sctiesMvmntDtls"
})
public class CorporateActionElection3 {

    @XmlElement(name = "AcctDtls")
    protected SecuritiesAccount7 acctDtls;
    @XmlElement(name = "OptnTp")
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "InstdUndrlygSctiesQty")
    protected UnitOrFaceAmount1Choice instdUndrlygSctiesQty;
    @XmlElement(name = "InstdSctiesQtyToRcv")
    protected UnitOrFaceAmount1Choice instdSctiesQtyToRcv;
    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CorporateActionCashMovements2> cshMvmntDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<CorporateActionSecuritiesMovement2> sctiesMvmntDtls;

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public SecuritiesAccount7 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public CorporateActionElection3 setAcctDtls(SecuritiesAccount7 value) {
        this.acctDtls = value;
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
    public CorporateActionElection3 setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
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
    public CorporateActionElection3 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the instdUndrlygSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getInstdUndrlygSctiesQty() {
        return instdUndrlygSctiesQty;
    }

    /**
     * Sets the value of the instdUndrlygSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateActionElection3 setInstdUndrlygSctiesQty(UnitOrFaceAmount1Choice value) {
        this.instdUndrlygSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the instdSctiesQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getInstdSctiesQtyToRcv() {
        return instdSctiesQtyToRcv;
    }

    /**
     * Sets the value of the instdSctiesQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateActionElection3 setInstdSctiesQtyToRcv(UnitOrFaceAmount1Choice value) {
        this.instdSctiesQtyToRcv = value;
        return this;
    }

    /**
     * Gets the value of the propsdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropsdRate() {
        return propsdRate;
    }

    /**
     * Sets the value of the propsdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionElection3 setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
        return this;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionCashMovements2 }
     * 
     * 
     */
    public List<CorporateActionCashMovements2> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CorporateActionCashMovements2>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionSecuritiesMovement2 }
     * 
     * 
     */
    public List<CorporateActionSecuritiesMovement2> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<CorporateActionSecuritiesMovement2>();
        }
        return this.sctiesMvmntDtls;
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
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public CorporateActionElection3 addCshMvmntDtls(CorporateActionCashMovements2 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public CorporateActionElection3 addSctiesMvmntDtls(CorporateActionSecuritiesMovement2 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

}

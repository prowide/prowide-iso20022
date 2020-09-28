
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
 * Details of the proceeds movements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceedsMovement1", propOrder = {
    "cshPrcdsMvmntDtls",
    "sctiesPrcdsMvmntDtls",
    "taxDtls"
})
public class ProceedsMovement1 {

    @XmlElement(name = "CshPrcdsMvmntDtls")
    protected List<CashProceeds1> cshPrcdsMvmntDtls;
    @XmlElement(name = "SctiesPrcdsMvmntDtls")
    protected List<SecuritiesProceeds1> sctiesPrcdsMvmntDtls;
    @XmlElement(name = "TaxDtls")
    protected TaxVoucher1 taxDtls;

    /**
     * Gets the value of the cshPrcdsMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshPrcdsMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshPrcdsMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashProceeds1 }
     * 
     * 
     */
    public List<CashProceeds1> getCshPrcdsMvmntDtls() {
        if (cshPrcdsMvmntDtls == null) {
            cshPrcdsMvmntDtls = new ArrayList<CashProceeds1>();
        }
        return this.cshPrcdsMvmntDtls;
    }

    /**
     * Gets the value of the sctiesPrcdsMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesPrcdsMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesPrcdsMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesProceeds1 }
     * 
     * 
     */
    public List<SecuritiesProceeds1> getSctiesPrcdsMvmntDtls() {
        if (sctiesPrcdsMvmntDtls == null) {
            sctiesPrcdsMvmntDtls = new ArrayList<SecuritiesProceeds1>();
        }
        return this.sctiesPrcdsMvmntDtls;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher1 }
     *     
     */
    public TaxVoucher1 getTaxDtls() {
        return taxDtls;
    }

    /**
     * Sets the value of the taxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher1 }
     *     
     */
    public ProceedsMovement1 setTaxDtls(TaxVoucher1 value) {
        this.taxDtls = value;
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
     * Adds a new item to the cshPrcdsMvmntDtls list.
     * @see #getCshPrcdsMvmntDtls()
     * 
     */
    public ProceedsMovement1 addCshPrcdsMvmntDtls(CashProceeds1 cshPrcdsMvmntDtls) {
        getCshPrcdsMvmntDtls().add(cshPrcdsMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesPrcdsMvmntDtls list.
     * @see #getSctiesPrcdsMvmntDtls()
     * 
     */
    public ProceedsMovement1 addSctiesPrcdsMvmntDtls(SecuritiesProceeds1 sctiesPrcdsMvmntDtls) {
        getSctiesPrcdsMvmntDtls().add(sctiesPrcdsMvmntDtls);
        return this;
    }

}

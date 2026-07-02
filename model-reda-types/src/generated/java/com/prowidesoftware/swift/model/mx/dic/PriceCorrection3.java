
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
 * Original and corrected price information of an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceCorrection3", propOrder = {
    "prevslySntPricDtls",
    "crrctdPricDtls",
    "xtnsn"
})
public class PriceCorrection3 {

    @XmlElement(name = "PrevslySntPricDtls", required = true)
    protected PriceValuation3 prevslySntPricDtls;
    @XmlElement(name = "CrrctdPricDtls")
    protected PriceValuation3 crrctdPricDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the prevslySntPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValuation3 }
     *     
     */
    public PriceValuation3 getPrevslySntPricDtls() {
        return prevslySntPricDtls;
    }

    /**
     * Sets the value of the prevslySntPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValuation3 }
     *     
     */
    public PriceCorrection3 setPrevslySntPricDtls(PriceValuation3 value) {
        this.prevslySntPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the crrctdPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValuation3 }
     *     
     */
    public PriceValuation3 getCrrctdPricDtls() {
        return crrctdPricDtls;
    }

    /**
     * Sets the value of the crrctdPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValuation3 }
     *     
     */
    public PriceCorrection3 setCrrctdPricDtls(PriceValuation3 value) {
        this.crrctdPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public PriceCorrection3 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}

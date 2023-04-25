
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information required for distribution in the German market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductInformation1", propOrder = {
    "esgCtgyGrmnFndMkt",
    "esgCtgyGrmnStrdSctiesMkt",
    "esgFcs",
    "esgLablOrStd"
})
public class AdditionalProductInformation1 {

    @XmlElement(name = "ESGCtgyGrmnFndMkt")
    @XmlSchemaType(name = "string")
    protected ESGCategoryGermanFundMarket1Code esgCtgyGrmnFndMkt;
    @XmlElement(name = "ESGCtgyGrmnStrdSctiesMkt")
    @XmlSchemaType(name = "string")
    protected ESGCategoryGermanStructuredSecuritiesMarket1Code esgCtgyGrmnStrdSctiesMkt;
    @XmlElement(name = "ESGFcs")
    @XmlSchemaType(name = "string")
    protected ESGFocus1Code esgFcs;
    @XmlElement(name = "ESGLablOrStd")
    @XmlSchemaType(name = "string")
    protected List<ESGLabelOrStandard1Code> esgLablOrStd;

    /**
     * Gets the value of the esgCtgyGrmnFndMkt property.
     * 
     * @return
     *     possible object is
     *     {@link ESGCategoryGermanFundMarket1Code }
     *     
     */
    public ESGCategoryGermanFundMarket1Code getESGCtgyGrmnFndMkt() {
        return esgCtgyGrmnFndMkt;
    }

    /**
     * Sets the value of the esgCtgyGrmnFndMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESGCategoryGermanFundMarket1Code }
     *     
     */
    public AdditionalProductInformation1 setESGCtgyGrmnFndMkt(ESGCategoryGermanFundMarket1Code value) {
        this.esgCtgyGrmnFndMkt = value;
        return this;
    }

    /**
     * Gets the value of the esgCtgyGrmnStrdSctiesMkt property.
     * 
     * @return
     *     possible object is
     *     {@link ESGCategoryGermanStructuredSecuritiesMarket1Code }
     *     
     */
    public ESGCategoryGermanStructuredSecuritiesMarket1Code getESGCtgyGrmnStrdSctiesMkt() {
        return esgCtgyGrmnStrdSctiesMkt;
    }

    /**
     * Sets the value of the esgCtgyGrmnStrdSctiesMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESGCategoryGermanStructuredSecuritiesMarket1Code }
     *     
     */
    public AdditionalProductInformation1 setESGCtgyGrmnStrdSctiesMkt(ESGCategoryGermanStructuredSecuritiesMarket1Code value) {
        this.esgCtgyGrmnStrdSctiesMkt = value;
        return this;
    }

    /**
     * Gets the value of the esgFcs property.
     * 
     * @return
     *     possible object is
     *     {@link ESGFocus1Code }
     *     
     */
    public ESGFocus1Code getESGFcs() {
        return esgFcs;
    }

    /**
     * Sets the value of the esgFcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESGFocus1Code }
     *     
     */
    public AdditionalProductInformation1 setESGFcs(ESGFocus1Code value) {
        this.esgFcs = value;
        return this;
    }

    /**
     * Gets the value of the esgLablOrStd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the esgLablOrStd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESGLablOrStd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ESGLabelOrStandard1Code }
     * 
     * 
     * @return
     *     The value of the esgLablOrStd property.
     */
    public List<ESGLabelOrStandard1Code> getESGLablOrStd() {
        if (esgLablOrStd == null) {
            esgLablOrStd = new ArrayList<>();
        }
        return this.esgLablOrStd;
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
     * Adds a new item to the eSGLablOrStd list.
     * @see #getESGLablOrStd()
     * 
     */
    public AdditionalProductInformation1 addESGLablOrStd(ESGLabelOrStandard1Code eSGLablOrStd) {
        getESGLablOrStd().add(eSGLablOrStd);
        return this;
    }

}

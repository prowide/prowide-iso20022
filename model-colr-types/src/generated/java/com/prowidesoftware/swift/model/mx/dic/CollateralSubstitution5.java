
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the collateral that will be substituted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitution5", propOrder = {
    "collSbstitnSeq",
    "sbstitnRqrmnt",
    "collSbstitnTp",
    "stdSttlmInstrs",
    "sctiesColl",
    "cshColl",
    "othrColl",
    "lkdRefs"
})
public class CollateralSubstitution5 {

    @XmlElement(name = "CollSbstitnSeq", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralSubstitutionSequence1Code collSbstitnSeq;
    @XmlElement(name = "SbstitnRqrmnt", required = true)
    protected ActiveCurrencyAndAmount sbstitnRqrmnt;
    @XmlElement(name = "CollSbstitnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralSubstitutionType1Code collSbstitnTp;
    @XmlElement(name = "StdSttlmInstrs")
    protected String stdSttlmInstrs;
    @XmlElement(name = "SctiesColl")
    protected List<SecuritiesCollateral7> sctiesColl;
    @XmlElement(name = "CshColl")
    protected List<CashCollateral5> cshColl;
    @XmlElement(name = "OthrColl")
    protected List<OtherCollateral7> othrColl;
    @XmlElement(name = "LkdRefs")
    protected Reference17 lkdRefs;

    /**
     * Gets the value of the collSbstitnSeq property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionSequence1Code }
     *     
     */
    public CollateralSubstitutionSequence1Code getCollSbstitnSeq() {
        return collSbstitnSeq;
    }

    /**
     * Sets the value of the collSbstitnSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionSequence1Code }
     *     
     */
    public CollateralSubstitution5 setCollSbstitnSeq(CollateralSubstitutionSequence1Code value) {
        this.collSbstitnSeq = value;
        return this;
    }

    /**
     * Gets the value of the sbstitnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSbstitnRqrmnt() {
        return sbstitnRqrmnt;
    }

    /**
     * Sets the value of the sbstitnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralSubstitution5 setSbstitnRqrmnt(ActiveCurrencyAndAmount value) {
        this.sbstitnRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionType1Code }
     *     
     */
    public CollateralSubstitutionType1Code getCollSbstitnTp() {
        return collSbstitnTp;
    }

    /**
     * Sets the value of the collSbstitnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionType1Code }
     *     
     */
    public CollateralSubstitution5 setCollSbstitnTp(CollateralSubstitutionType1Code value) {
        this.collSbstitnTp = value;
        return this;
    }

    /**
     * Gets the value of the stdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSttlmInstrs() {
        return stdSttlmInstrs;
    }

    /**
     * Sets the value of the stdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralSubstitution5 setStdSttlmInstrs(String value) {
        this.stdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the sctiesColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCollateral7 }
     * 
     * 
     */
    public List<SecuritiesCollateral7> getSctiesColl() {
        if (sctiesColl == null) {
            sctiesColl = new ArrayList<SecuritiesCollateral7>();
        }
        return this.sctiesColl;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashCollateral5 }
     * 
     * 
     */
    public List<CashCollateral5> getCshColl() {
        if (cshColl == null) {
            cshColl = new ArrayList<CashCollateral5>();
        }
        return this.cshColl;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCollateral7 }
     * 
     * 
     */
    public List<OtherCollateral7> getOthrColl() {
        if (othrColl == null) {
            othrColl = new ArrayList<OtherCollateral7>();
        }
        return this.othrColl;
    }

    /**
     * Gets the value of the lkdRefs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference17 }
     *     
     */
    public Reference17 getLkdRefs() {
        return lkdRefs;
    }

    /**
     * Sets the value of the lkdRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference17 }
     *     
     */
    public CollateralSubstitution5 setLkdRefs(Reference17 value) {
        this.lkdRefs = value;
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
     * Adds a new item to the sctiesColl list.
     * @see #getSctiesColl()
     * 
     */
    public CollateralSubstitution5 addSctiesColl(SecuritiesCollateral7 sctiesColl) {
        getSctiesColl().add(sctiesColl);
        return this;
    }

    /**
     * Adds a new item to the cshColl list.
     * @see #getCshColl()
     * 
     */
    public CollateralSubstitution5 addCshColl(CashCollateral5 cshColl) {
        getCshColl().add(cshColl);
        return this;
    }

    /**
     * Adds a new item to the othrColl list.
     * @see #getOthrColl()
     * 
     */
    public CollateralSubstitution5 addOthrColl(OtherCollateral7 othrColl) {
        getOthrColl().add(othrColl);
        return this;
    }

}

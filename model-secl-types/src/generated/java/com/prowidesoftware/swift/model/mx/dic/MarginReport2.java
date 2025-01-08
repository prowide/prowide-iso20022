
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details on the margin report per margin account, and optionally per non-clearing member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginReport2", propOrder = {
    "mrgnPdct",
    "mrgnAcct",
    "collsdMrgnAcctInd",
    "nonClrMmb",
    "mrgnClctnSummry",
    "mrgnClctn"
})
public class MarginReport2 {

    @XmlElement(name = "MrgnPdct")
    protected List<MarginProductType1Choice> mrgnPdct;
    @XmlElement(name = "MrgnAcct", required = true)
    protected SecuritiesAccount18 mrgnAcct;
    @XmlElement(name = "CollsdMrgnAcctInd")
    protected Boolean collsdMrgnAcctInd;
    @XmlElement(name = "NonClrMmb")
    protected List<PartyIdentificationAndAccount31> nonClrMmb;
    @XmlElement(name = "MrgnClctnSummry")
    protected MarginCalculation1 mrgnClctnSummry;
    @XmlElement(name = "MrgnClctn", required = true)
    protected List<MarginCalculation2> mrgnClctn;

    /**
     * Gets the value of the mrgnPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginProductType1Choice }
     * 
     * 
     * @return
     *     The value of the mrgnPdct property.
     */
    public List<MarginProductType1Choice> getMrgnPdct() {
        if (mrgnPdct == null) {
            mrgnPdct = new ArrayList<>();
        }
        return this.mrgnPdct;
    }

    /**
     * Gets the value of the mrgnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getMrgnAcct() {
        return mrgnAcct;
    }

    /**
     * Sets the value of the mrgnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public MarginReport2 setMrgnAcct(SecuritiesAccount18 value) {
        this.mrgnAcct = value;
        return this;
    }

    /**
     * Gets the value of the collsdMrgnAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollsdMrgnAcctInd() {
        return collsdMrgnAcctInd;
    }

    /**
     * Sets the value of the collsdMrgnAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MarginReport2 setCollsdMrgnAcctInd(Boolean value) {
        this.collsdMrgnAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonClrMmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonClrMmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount31 }
     * 
     * 
     * @return
     *     The value of the nonClrMmb property.
     */
    public List<PartyIdentificationAndAccount31> getNonClrMmb() {
        if (nonClrMmb == null) {
            nonClrMmb = new ArrayList<>();
        }
        return this.nonClrMmb;
    }

    /**
     * Gets the value of the mrgnClctnSummry property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCalculation1 }
     *     
     */
    public MarginCalculation1 getMrgnClctnSummry() {
        return mrgnClctnSummry;
    }

    /**
     * Sets the value of the mrgnClctnSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCalculation1 }
     *     
     */
    public MarginReport2 setMrgnClctnSummry(MarginCalculation1 value) {
        this.mrgnClctnSummry = value;
        return this;
    }

    /**
     * Gets the value of the mrgnClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginCalculation2 }
     * 
     * 
     * @return
     *     The value of the mrgnClctn property.
     */
    public List<MarginCalculation2> getMrgnClctn() {
        if (mrgnClctn == null) {
            mrgnClctn = new ArrayList<>();
        }
        return this.mrgnClctn;
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
     * Adds a new item to the mrgnPdct list.
     * @see #getMrgnPdct()
     * 
     */
    public MarginReport2 addMrgnPdct(MarginProductType1Choice mrgnPdct) {
        getMrgnPdct().add(mrgnPdct);
        return this;
    }

    /**
     * Adds a new item to the nonClrMmb list.
     * @see #getNonClrMmb()
     * 
     */
    public MarginReport2 addNonClrMmb(PartyIdentificationAndAccount31 nonClrMmb) {
        getNonClrMmb().add(nonClrMmb);
        return this;
    }

    /**
     * Adds a new item to the mrgnClctn list.
     * @see #getMrgnClctn()
     * 
     */
    public MarginReport2 addMrgnClctn(MarginCalculation2 mrgnClctn) {
        getMrgnClctn().add(mrgnClctn);
        return this;
    }

}

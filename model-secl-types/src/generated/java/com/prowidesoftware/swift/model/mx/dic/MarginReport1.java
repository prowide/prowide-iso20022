
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
 * Provides the details on the margin report per clearing member, and optionaly either per financial instrument or per non-clearing member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginReport1", propOrder = {
    "mrgnAcct",
    "nonClrMmb",
    "mrgnPdct",
    "mrgnDtls"
})
public class MarginReport1 {

    @XmlElement(name = "MrgnAcct", required = true)
    protected SecuritiesAccount18 mrgnAcct;
    @XmlElement(name = "NonClrMmb")
    protected List<PartyIdentificationAndAccount31> nonClrMmb;
    @XmlElement(name = "MrgnPdct", required = true)
    protected List<MarginProductType1Choice> mrgnPdct;
    @XmlElement(name = "MrgnDtls", required = true)
    protected List<Margin2> mrgnDtls;

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
    public MarginReport1 setMrgnAcct(SecuritiesAccount18 value) {
        this.mrgnAcct = value;
        return this;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonClrMmb property.
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
     */
    public List<PartyIdentificationAndAccount31> getNonClrMmb() {
        if (nonClrMmb == null) {
            nonClrMmb = new ArrayList<PartyIdentificationAndAccount31>();
        }
        return this.nonClrMmb;
    }

    /**
     * Gets the value of the mrgnPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrgnPdct property.
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
     */
    public List<MarginProductType1Choice> getMrgnPdct() {
        if (mrgnPdct == null) {
            mrgnPdct = new ArrayList<MarginProductType1Choice>();
        }
        return this.mrgnPdct;
    }

    /**
     * Gets the value of the mrgnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrgnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Margin2 }
     * 
     * 
     */
    public List<Margin2> getMrgnDtls() {
        if (mrgnDtls == null) {
            mrgnDtls = new ArrayList<Margin2>();
        }
        return this.mrgnDtls;
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
     * Adds a new item to the nonClrMmb list.
     * @see #getNonClrMmb()
     * 
     */
    public MarginReport1 addNonClrMmb(PartyIdentificationAndAccount31 nonClrMmb) {
        getNonClrMmb().add(nonClrMmb);
        return this;
    }

    /**
     * Adds a new item to the mrgnPdct list.
     * @see #getMrgnPdct()
     * 
     */
    public MarginReport1 addMrgnPdct(MarginProductType1Choice mrgnPdct) {
        getMrgnPdct().add(mrgnPdct);
        return this;
    }

    /**
     * Adds a new item to the mrgnDtls list.
     * @see #getMrgnDtls()
     * 
     */
    public MarginReport1 addMrgnDtls(Margin2 mrgnDtls) {
        getMrgnDtls().add(mrgnDtls);
        return this;
    }

}

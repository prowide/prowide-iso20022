
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
 * Choice of format for the classification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType2", propOrder = {
    "clssfctnFinInstrm",
    "finInstrmPdctTpCd",
    "altrnClssfctn"
})
public class ClassificationType2 {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "FinInstrmPdctTpCd")
    protected String finInstrmPdctTpCd;
    @XmlElement(name = "AltrnClssfctn")
    protected List<GenericIdentification36> altrnClssfctn;

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClassificationType2 setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmPdctTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmPdctTpCd() {
        return finInstrmPdctTpCd;
    }

    /**
     * Sets the value of the finInstrmPdctTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClassificationType2 setFinInstrmPdctTpCd(String value) {
        this.finInstrmPdctTpCd = value;
        return this;
    }

    /**
     * Gets the value of the altrnClssfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altrnClssfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnClssfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification36 }
     * 
     * 
     */
    public List<GenericIdentification36> getAltrnClssfctn() {
        if (altrnClssfctn == null) {
            altrnClssfctn = new ArrayList<GenericIdentification36>();
        }
        return this.altrnClssfctn;
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
     * Adds a new item to the altrnClssfctn list.
     * @see #getAltrnClssfctn()
     * 
     */
    public ClassificationType2 addAltrnClssfctn(GenericIdentification36 altrnClssfctn) {
        getAltrnClssfctn().add(altrnClssfctn);
        return this;
    }

}

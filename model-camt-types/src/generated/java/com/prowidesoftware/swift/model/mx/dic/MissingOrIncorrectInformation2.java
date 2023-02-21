
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
 * Set of elements used to provide further information on the reason for the unable to apply investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingOrIncorrectInformation2", propOrder = {
    "amlReq",
    "mssngInf",
    "incrrctInf"
})
public class MissingOrIncorrectInformation2 {

    @XmlElement(name = "AMLReq")
    protected Boolean amlReq;
    @XmlElement(name = "MssngInf")
    @XmlSchemaType(name = "string")
    protected List<UnableToApplyMissingInformation2Code> mssngInf;
    @XmlElement(name = "IncrrctInf")
    @XmlSchemaType(name = "string")
    protected List<UnableToApplyIncorrectInformation3Code> incrrctInf;

    /**
     * Gets the value of the amlReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAMLReq() {
        return amlReq;
    }

    /**
     * Sets the value of the amlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MissingOrIncorrectInformation2 setAMLReq(Boolean value) {
        this.amlReq = value;
        return this;
    }

    /**
     * Gets the value of the mssngInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mssngInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMssngInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnableToApplyMissingInformation2Code }
     * 
     * 
     */
    public List<UnableToApplyMissingInformation2Code> getMssngInf() {
        if (mssngInf == null) {
            mssngInf = new ArrayList<UnableToApplyMissingInformation2Code>();
        }
        return this.mssngInf;
    }

    /**
     * Gets the value of the incrrctInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incrrctInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncrrctInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnableToApplyIncorrectInformation3Code }
     * 
     * 
     */
    public List<UnableToApplyIncorrectInformation3Code> getIncrrctInf() {
        if (incrrctInf == null) {
            incrrctInf = new ArrayList<UnableToApplyIncorrectInformation3Code>();
        }
        return this.incrrctInf;
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
     * Adds a new item to the mssngInf list.
     * @see #getMssngInf()
     * 
     */
    public MissingOrIncorrectInformation2 addMssngInf(UnableToApplyMissingInformation2Code mssngInf) {
        getMssngInf().add(mssngInf);
        return this;
    }

    /**
     * Adds a new item to the incrrctInf list.
     * @see #getIncrrctInf()
     * 
     */
    public MissingOrIncorrectInformation2 addIncrrctInf(UnableToApplyIncorrectInformation3Code incrrctInf) {
        getIncrrctInf().add(incrrctInf);
        return this;
    }

}

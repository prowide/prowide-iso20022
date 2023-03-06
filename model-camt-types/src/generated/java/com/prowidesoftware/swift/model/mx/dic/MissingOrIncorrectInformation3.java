
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
 * Set of elements used to provide further information on the reason for the unable to apply investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingOrIncorrectInformation3", propOrder = {
    "amlReq",
    "mssngInf",
    "incrrctInf"
})
public class MissingOrIncorrectInformation3 {

    @XmlElement(name = "AMLReq")
    protected Boolean amlReq;
    @XmlElement(name = "MssngInf")
    protected List<UnableToApplyMissing1> mssngInf;
    @XmlElement(name = "IncrrctInf")
    protected List<UnableToApplyIncorrect1> incrrctInf;

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
    public MissingOrIncorrectInformation3 setAMLReq(Boolean value) {
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
     * {@link UnableToApplyMissing1 }
     * 
     * 
     */
    public List<UnableToApplyMissing1> getMssngInf() {
        if (mssngInf == null) {
            mssngInf = new ArrayList<UnableToApplyMissing1>();
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
     * {@link UnableToApplyIncorrect1 }
     * 
     * 
     */
    public List<UnableToApplyIncorrect1> getIncrrctInf() {
        if (incrrctInf == null) {
            incrrctInf = new ArrayList<UnableToApplyIncorrect1>();
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
    public MissingOrIncorrectInformation3 addMssngInf(UnableToApplyMissing1 mssngInf) {
        getMssngInf().add(mssngInf);
        return this;
    }

    /**
     * Adds a new item to the incrrctInf list.
     * @see #getIncrrctInf()
     * 
     */
    public MissingOrIncorrectInformation3 addIncrrctInf(UnableToApplyIncorrect1 incrrctInf) {
        getIncrrctInf().add(incrrctInf);
        return this;
    }

}

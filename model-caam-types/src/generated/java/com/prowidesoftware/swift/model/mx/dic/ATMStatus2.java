
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
 * Global status of the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMStatus2", propOrder = {
    "curSts",
    "curStsRsn",
    "dmnddSts"
})
public class ATMStatus2 {

    @XmlElement(name = "CurSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code curSts;
    @XmlElement(name = "CurStsRsn")
    protected List<String> curStsRsn;
    @XmlElement(name = "DmnddSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code dmnddSts;

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1Code getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus2 setCurSts(ATMStatus1Code value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the curStsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curStsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCurStsRsn() {
        if (curStsRsn == null) {
            curStsRsn = new ArrayList<String>();
        }
        return this.curStsRsn;
    }

    /**
     * Gets the value of the dmnddSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1Code getDmnddSts() {
        return dmnddSts;
    }

    /**
     * Sets the value of the dmnddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus2 setDmnddSts(ATMStatus1Code value) {
        this.dmnddSts = value;
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
     * Adds a new item to the curStsRsn list.
     * @see #getCurStsRsn()
     * 
     */
    public ATMStatus2 addCurStsRsn(String curStsRsn) {
        getCurStsRsn().add(curStsRsn);
        return this;
    }

}

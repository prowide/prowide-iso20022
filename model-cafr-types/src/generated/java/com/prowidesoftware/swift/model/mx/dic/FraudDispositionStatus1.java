
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
 * Disposition of previously submitted fraud report message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionStatus1", propOrder = {
    "actnTaken",
    "othrActnTaken",
    "errData",
    "wrngData",
    "addtlInf"
})
public class FraudDispositionStatus1 {

    @XmlElement(name = "ActnTaken", required = true)
    @XmlSchemaType(name = "string")
    protected ActionTaken1Code actnTaken;
    @XmlElement(name = "OthrActnTaken")
    protected String othrActnTaken;
    @XmlElement(name = "ErrData")
    protected List<String> errData;
    @XmlElement(name = "WrngData")
    protected List<String> wrngData;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation22 addtlInf;

    /**
     * Gets the value of the actnTaken property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaken1Code }
     *     
     */
    public ActionTaken1Code getActnTaken() {
        return actnTaken;
    }

    /**
     * Sets the value of the actnTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaken1Code }
     *     
     */
    public FraudDispositionStatus1 setActnTaken(ActionTaken1Code value) {
        this.actnTaken = value;
        return this;
    }

    /**
     * Gets the value of the othrActnTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActnTaken() {
        return othrActnTaken;
    }

    /**
     * Sets the value of the othrActnTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudDispositionStatus1 setOthrActnTaken(String value) {
        this.othrActnTaken = value;
        return this;
    }

    /**
     * Gets the value of the errData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrData() {
        if (errData == null) {
            errData = new ArrayList<String>();
        }
        return this.errData;
    }

    /**
     * Gets the value of the wrngData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wrngData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWrngData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWrngData() {
        if (wrngData == null) {
            wrngData = new ArrayList<String>();
        }
        return this.wrngData;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation22 }
     *     
     */
    public AdditionalInformation22 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation22 }
     *     
     */
    public FraudDispositionStatus1 setAddtlInf(AdditionalInformation22 value) {
        this.addtlInf = value;
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
     * Adds a new item to the errData list.
     * @see #getErrData()
     * 
     */
    public FraudDispositionStatus1 addErrData(String errData) {
        getErrData().add(errData);
        return this;
    }

    /**
     * Adds a new item to the wrngData list.
     * @see #getWrngData()
     * 
     */
    public FraudDispositionStatus1 addWrngData(String wrngData) {
        getWrngData().add(wrngData);
        return this;
    }

}

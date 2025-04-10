
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
 * Disposition of previously submitted fraud report message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionStatus2", propOrder = {
    "actnTaken",
    "othrActnTaken",
    "errData",
    "wrngData",
    "addtlInf"
})
public class FraudDispositionStatus2 {

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
    protected List<AdditionalInformation30> addtlInf;

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
    public FraudDispositionStatus2 setActnTaken(ActionTaken1Code value) {
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
    public FraudDispositionStatus2 setOthrActnTaken(String value) {
        this.othrActnTaken = value;
        return this;
    }

    /**
     * Gets the value of the errData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errData property.
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
     * @return
     *     The value of the errData property.
     */
    public List<String> getErrData() {
        if (errData == null) {
            errData = new ArrayList<>();
        }
        return this.errData;
    }

    /**
     * Gets the value of the wrngData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wrngData property.
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
     * @return
     *     The value of the wrngData property.
     */
    public List<String> getWrngData() {
        if (wrngData == null) {
            wrngData = new ArrayList<>();
        }
        return this.wrngData;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation30 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation30> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
    public FraudDispositionStatus2 addErrData(String errData) {
        getErrData().add(errData);
        return this;
    }

    /**
     * Adds a new item to the wrngData list.
     * @see #getWrngData()
     * 
     */
    public FraudDispositionStatus2 addWrngData(String wrngData) {
        getWrngData().add(wrngData);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public FraudDispositionStatus2 addAddtlInf(AdditionalInformation30 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}

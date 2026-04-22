
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
@XmlType(name = "FraudDispositionStatus3", propOrder = {
    "actnTaken",
    "errData",
    "wrngData"
})
public class FraudDispositionStatus3 {

    @XmlElement(name = "ActnTaken", required = true)
    @XmlSchemaType(name = "string")
    protected ActionTaken2Code actnTaken;
    @XmlElement(name = "ErrData")
    protected List<String> errData;
    @XmlElement(name = "WrngData")
    protected List<String> wrngData;

    /**
     * Gets the value of the actnTaken property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaken2Code }
     *     
     */
    public ActionTaken2Code getActnTaken() {
        return actnTaken;
    }

    /**
     * Sets the value of the actnTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaken2Code }
     *     
     */
    public FraudDispositionStatus3 setActnTaken(ActionTaken2Code value) {
        this.actnTaken = value;
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
    public FraudDispositionStatus3 addErrData(String errData) {
        getErrData().add(errData);
        return this;
    }

    /**
     * Adds a new item to the wrngData list.
     * @see #getWrngData()
     * 
     */
    public FraudDispositionStatus3 addWrngData(String wrngData) {
        getWrngData().add(wrngData);
        return this;
    }

}

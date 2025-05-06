
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
 * Information related to a configuration report of an ATM device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMConfigurationReportComponent1", propOrder = {
    "envt",
    "actvVrsn",
    "nonActvVrsn"
})
public class ATMConfigurationReportComponent1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment7 envt;
    @XmlElement(name = "ActvVrsn")
    protected String actvVrsn;
    @XmlElement(name = "NonActvVrsn")
    protected List<ATMVersionReport1> nonActvVrsn;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMEnvironment7 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMConfigurationReportComponent1 setEnvt(ATMEnvironment7 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the actvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvVrsn() {
        return actvVrsn;
    }

    /**
     * Sets the value of the actvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMConfigurationReportComponent1 setActvVrsn(String value) {
        this.actvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the nonActvVrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonActvVrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonActvVrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMVersionReport1 }
     * 
     * 
     * @return
     *     The value of the nonActvVrsn property.
     */
    public List<ATMVersionReport1> getNonActvVrsn() {
        if (nonActvVrsn == null) {
            nonActvVrsn = new ArrayList<>();
        }
        return this.nonActvVrsn;
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
     * Adds a new item to the nonActvVrsn list.
     * @see #getNonActvVrsn()
     * 
     */
    public ATMConfigurationReportComponent1 addNonActvVrsn(ATMVersionReport1 nonActvVrsn) {
        getNonActvVrsn().add(nonActvVrsn);
        return this;
    }

}


package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the control of a configuration on ATM device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMConfigurationControlComponent1", propOrder = {
    "envt",
    "cfgtnVrsn",
    "actnReqrd",
    "prprty",
    "actvtnDt"
})
public class ATMConfigurationControlComponent1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment7 envt;
    @XmlElement(name = "CfgtnVrsn")
    protected String cfgtnVrsn;
    @XmlElement(name = "ActnReqrd", required = true)
    @XmlSchemaType(name = "string")
    protected ATMActionType1Code actnReqrd;
    @XmlElement(name = "Prprty")
    protected List<ATMPropertyComponent1> prprty;
    @XmlElement(name = "ActvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actvtnDt;

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
    public ATMConfigurationControlComponent1 setEnvt(ATMEnvironment7 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cfgtnVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgtnVrsn() {
        return cfgtnVrsn;
    }

    /**
     * Sets the value of the cfgtnVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMConfigurationControlComponent1 setCfgtnVrsn(String value) {
        this.cfgtnVrsn = value;
        return this;
    }

    /**
     * Gets the value of the actnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link ATMActionType1Code }
     *     
     */
    public ATMActionType1Code getActnReqrd() {
        return actnReqrd;
    }

    /**
     * Sets the value of the actnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMActionType1Code }
     *     
     */
    public ATMConfigurationControlComponent1 setActnReqrd(ATMActionType1Code value) {
        this.actnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the prprty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prprty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrprty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMPropertyComponent1 }
     * 
     * 
     */
    public List<ATMPropertyComponent1> getPrprty() {
        if (prprty == null) {
            prprty = new ArrayList<ATMPropertyComponent1>();
        }
        return this.prprty;
    }

    /**
     * Gets the value of the actvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Sets the value of the actvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMConfigurationControlComponent1 setActvtnDt(XMLGregorianCalendar value) {
        this.actvtnDt = value;
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
     * Adds a new item to the prprty list.
     * @see #getPrprty()
     * 
     */
    public ATMConfigurationControlComponent1 addPrprty(ATMPropertyComponent1 prprty) {
        getPrprty().add(prprty);
        return this;
    }

}


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
 * This component define the type of admin service to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrativeRequest3", propOrder = {
    "envt",
    "cntxt",
    "admstvSvcId",
    "splmtryData"
})
public class AdministrativeRequest3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment75 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext28 cntxt;
    @XmlElement(name = "AdmstvSvcId")
    protected String admstvSvcId;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public CardPaymentEnvironment75 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public AdministrativeRequest3 setEnvt(CardPaymentEnvironment75 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public CardPaymentContext28 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public AdministrativeRequest3 setCntxt(CardPaymentContext28 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the admstvSvcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmstvSvcId() {
        return admstvSvcId;
    }

    /**
     * Sets the value of the admstvSvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdministrativeRequest3 setAdmstvSvcId(String value) {
        this.admstvSvcId = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AdministrativeRequest3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}

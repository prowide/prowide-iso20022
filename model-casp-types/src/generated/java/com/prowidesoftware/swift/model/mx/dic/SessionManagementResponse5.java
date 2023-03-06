
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
 * This component define the type of admin service to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagementResponse5", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "lgnRspn",
    "dgnssRspn",
    "rspn",
    "splmtryData"
})
public class SessionManagementResponse5 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment78 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext29 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService5Code svcCntt;
    @XmlElement(name = "LgnRspn")
    protected LoginResponse4 lgnRspn;
    @XmlElement(name = "DgnssRspn")
    protected DiagnosisResponse4 dgnssRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public CardPaymentEnvironment78 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public SessionManagementResponse5 setEnvt(CardPaymentEnvironment78 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public CardPaymentContext29 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public SessionManagementResponse5 setCntxt(CardPaymentContext29 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService5Code }
     *     
     */
    public RetailerService5Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService5Code }
     *     
     */
    public SessionManagementResponse5 setSvcCntt(RetailerService5Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the lgnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse4 }
     *     
     */
    public LoginResponse4 getLgnRspn() {
        return lgnRspn;
    }

    /**
     * Sets the value of the lgnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse4 }
     *     
     */
    public SessionManagementResponse5 setLgnRspn(LoginResponse4 value) {
        this.lgnRspn = value;
        return this;
    }

    /**
     * Gets the value of the dgnssRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisResponse4 }
     *     
     */
    public DiagnosisResponse4 getDgnssRspn() {
        return dgnssRspn;
    }

    /**
     * Sets the value of the dgnssRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisResponse4 }
     *     
     */
    public SessionManagementResponse5 setDgnssRspn(DiagnosisResponse4 value) {
        this.dgnssRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public SessionManagementResponse5 setRspn(ResponseType11 value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
    public SessionManagementResponse5 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}

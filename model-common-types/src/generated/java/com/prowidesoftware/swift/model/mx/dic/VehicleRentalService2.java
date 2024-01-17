
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Vehicle rental service provides detailed vehicle rental information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalService2", propOrder = {
    "vhclRntlCpny",
    "cstmr",
    "summryCmmdtyId",
    "rntlAgrmt",
    "rntlInvc",
    "addtlData"
})
public class VehicleRentalService2 {

    @XmlElement(name = "VhclRntlCpny")
    protected VehicleRentalCompany2 vhclRntlCpny;
    @XmlElement(name = "Cstmr")
    protected VehicleRentalCustomer2 cstmr;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "RntlAgrmt")
    protected VehicleRentalAgreement2 rntlAgrmt;
    @XmlElement(name = "RntlInvc")
    protected VehicleRentalInvoice2 rntlInvc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the vhclRntlCpny property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCompany2 }
     *     
     */
    public VehicleRentalCompany2 getVhclRntlCpny() {
        return vhclRntlCpny;
    }

    /**
     * Sets the value of the vhclRntlCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCompany2 }
     *     
     */
    public VehicleRentalService2 setVhclRntlCpny(VehicleRentalCompany2 value) {
        this.vhclRntlCpny = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCustomer2 }
     *     
     */
    public VehicleRentalCustomer2 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCustomer2 }
     *     
     */
    public VehicleRentalService2 setCstmr(VehicleRentalCustomer2 value) {
        this.cstmr = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService2 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the rntlAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalAgreement2 }
     *     
     */
    public VehicleRentalAgreement2 getRntlAgrmt() {
        return rntlAgrmt;
    }

    /**
     * Sets the value of the rntlAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalAgreement2 }
     *     
     */
    public VehicleRentalService2 setRntlAgrmt(VehicleRentalAgreement2 value) {
        this.rntlAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the rntlInvc property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalInvoice2 }
     *     
     */
    public VehicleRentalInvoice2 getRntlInvc() {
        return rntlInvc;
    }

    /**
     * Sets the value of the rntlInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalInvoice2 }
     *     
     */
    public VehicleRentalService2 setRntlInvc(VehicleRentalInvoice2 value) {
        this.rntlInvc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService2 setAddtlData(String value) {
        this.addtlData = value;
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

}

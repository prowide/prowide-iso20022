
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
 * Details of the customer device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDevice4", propOrder = {
    "dvc",
    "dvcId",
    "oprgSys",
    "prvdr",
    "addtlData"
})
public class CustomerDevice4 {

    @XmlElement(name = "Dvc")
    protected Device2 dvc;
    @XmlElement(name = "DvcId")
    protected DeviceIdentification1 dvcId;
    @XmlElement(name = "OprgSys")
    protected DeviceOperatingSystem1 oprgSys;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the dvc property.
     * 
     * @return
     *     possible object is
     *     {@link Device2 }
     *     
     */
    public Device2 getDvc() {
        return dvc;
    }

    /**
     * Sets the value of the dvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device2 }
     *     
     */
    public CustomerDevice4 setDvc(Device2 value) {
        this.dvc = value;
        return this;
    }

    /**
     * Gets the value of the dvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdentification1 }
     *     
     */
    public DeviceIdentification1 getDvcId() {
        return dvcId;
    }

    /**
     * Sets the value of the dvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdentification1 }
     *     
     */
    public CustomerDevice4 setDvcId(DeviceIdentification1 value) {
        this.dvcId = value;
        return this;
    }

    /**
     * Gets the value of the oprgSys property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOperatingSystem1 }
     *     
     */
    public DeviceOperatingSystem1 getOprgSys() {
        return oprgSys;
    }

    /**
     * Sets the value of the oprgSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOperatingSystem1 }
     *     
     */
    public CustomerDevice4 setOprgSys(DeviceOperatingSystem1 value) {
        this.oprgSys = value;
        return this;
    }

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice4 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public CustomerDevice4 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}


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
 * This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to inform the financial institution that the confidentiality status of the investigation has changed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRequestStatusChangeNotificationV01", propOrder = {
    "orgnlBizQry",
    "cnfdtltySts",
    "splmtryData"
})
public class InformationRequestStatusChangeNotificationV01 {

    @XmlElement(name = "OrgnlBizQry", required = true)
    protected String orgnlBizQry;
    @XmlElement(name = "CnfdtltySts")
    protected boolean cnfdtltySts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlBizQry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlBizQry() {
        return orgnlBizQry;
    }

    /**
     * Sets the value of the orgnlBizQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InformationRequestStatusChangeNotificationV01 setOrgnlBizQry(String value) {
        this.orgnlBizQry = value;
        return this;
    }

    /**
     * Gets the value of the cnfdtltySts property.
     * 
     */
    public boolean isCnfdtltySts() {
        return cnfdtltySts;
    }

    /**
     * Sets the value of the cnfdtltySts property.
     * 
     */
    public InformationRequestStatusChangeNotificationV01 setCnfdtltySts(boolean value) {
        this.cnfdtltySts = value;
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
    public InformationRequestStatusChangeNotificationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}

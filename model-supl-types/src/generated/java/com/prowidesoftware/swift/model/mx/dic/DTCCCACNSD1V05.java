
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
 * The DTCCCACNSD1 message extends ISO corporate action cancellation advise (CACN) message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACNSD1V05", propOrder = {
    "ntfctn",
    "gnlInf",
    "evtsLkg",
    "xtrnlCmnts"
})
public class DTCCCACNSD1V05 {

    @XmlElement(name = "Ntfctn")
    protected CorporateActionNotificationSD1 ntfctn;
    @XmlElement(name = "GnlInf")
    protected CorporateActionGeneralInformationSD19 gnlInf;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionCancellationSD1> evtsLkg;
    @XmlElement(name = "XtrnlCmnts")
    protected CorporateActionCancellationSD2 xtrnlCmnts;

    /**
     * Gets the value of the ntfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public CorporateActionNotificationSD1 getNtfctn() {
        return ntfctn;
    }

    /**
     * Sets the value of the ntfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public DTCCCACNSD1V05 setNtfctn(CorporateActionNotificationSD1 value) {
        this.ntfctn = value;
        return this;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD19 }
     *     
     */
    public CorporateActionGeneralInformationSD19 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD19 }
     *     
     */
    public DTCCCACNSD1V05 setGnlInf(CorporateActionGeneralInformationSD19 value) {
        this.gnlInf = value;
        return this;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtsLkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionCancellationSD1 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<CorporateActionCancellationSD1> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the xtrnlCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationSD2 }
     *     
     */
    public CorporateActionCancellationSD2 getXtrnlCmnts() {
        return xtrnlCmnts;
    }

    /**
     * Sets the value of the xtrnlCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationSD2 }
     *     
     */
    public DTCCCACNSD1V05 setXtrnlCmnts(CorporateActionCancellationSD2 value) {
        this.xtrnlCmnts = value;
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
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public DTCCCACNSD1V05 addEvtsLkg(CorporateActionCancellationSD1 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

}

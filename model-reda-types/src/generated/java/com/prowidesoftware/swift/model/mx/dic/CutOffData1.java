
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
 * Contains the new, current and previous cut offs for a netting cut off held at the central system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutOffData1", propOrder = {
    "ptcptId",
    "netgCutOffDtls"
})
public class CutOffData1 {

    @XmlElement(name = "PtcptId", required = true)
    protected PartyIdentification73Choice ptcptId;
    @XmlElement(name = "NetgCutOffDtls", required = true)
    protected List<NettingCutOff1> netgCutOffDtls;

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public CutOffData1 setPtcptId(PartyIdentification73Choice value) {
        this.ptcptId = value;
        return this;
    }

    /**
     * Gets the value of the netgCutOffDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netgCutOffDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetgCutOffDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NettingCutOff1 }
     * 
     * 
     * @return
     *     The value of the netgCutOffDtls property.
     */
    public List<NettingCutOff1> getNetgCutOffDtls() {
        if (netgCutOffDtls == null) {
            netgCutOffDtls = new ArrayList<>();
        }
        return this.netgCutOffDtls;
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
     * Adds a new item to the netgCutOffDtls list.
     * @see #getNetgCutOffDtls()
     * 
     */
    public CutOffData1 addNetgCutOffDtls(NettingCutOff1 netgCutOffDtls) {
        getNetgCutOffDtls().add(netgCutOffDtls);
        return this;
    }

}

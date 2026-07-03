
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CutOffData2", propOrder = {
    "ptcptId",
    "netgCutOffDtls"
})
public class CutOffData2 {

    @XmlElement(name = "PtcptId", required = true)
    protected PartyIdentification242Choice ptcptId;
    @XmlElement(name = "NetgCutOffDtls", required = true)
    protected List<NettingCutOff2> netgCutOffDtls;

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public CutOffData2 setPtcptId(PartyIdentification242Choice value) {
        this.ptcptId = value;
        return this;
    }

    /**
     * Gets the value of the netgCutOffDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netgCutOffDtls property.
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
     * {@link NettingCutOff2 }
     * 
     * 
     */
    public List<NettingCutOff2> getNetgCutOffDtls() {
        if (netgCutOffDtls == null) {
            netgCutOffDtls = new ArrayList<NettingCutOff2>();
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
    public CutOffData2 addNetgCutOffDtls(NettingCutOff2 netgCutOffDtls) {
        getNetgCutOffDtls().add(netgCutOffDtls);
        return this;
    }

}

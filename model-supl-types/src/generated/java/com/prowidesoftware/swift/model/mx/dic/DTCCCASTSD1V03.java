
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
 * The DTCCCASTSD1 message extends ISO Corporate Action Instruction Statement Report message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCASTSD1V03", propOrder = {
    "evtBalDtls",
    "ttlInstdBalOptnBalDtls",
    "ttlInstdBalOptnInstrDtls",
    "ttlInstdBalOptnPrtctInstrDtls"
})
public class DTCCCASTSD1V03 {

    @XmlElement(name = "EvtBalDtls")
    protected CorporateActionBalanceSD5 evtBalDtls;
    @XmlElement(name = "TtlInstdBalOptnBalDtls")
    protected List<CorporateActionInstructedBalanceOptionBalanceSD3> ttlInstdBalOptnBalDtls;
    @XmlElement(name = "TtlInstdBalOptnInstrDtls")
    protected List<CorporateActionInstructedBalanceOptionInstructionSD3> ttlInstdBalOptnInstrDtls;
    @XmlElement(name = "TtlInstdBalOptnPrtctInstrDtls")
    protected List<CorporateActionInstructedBalanceOptionProtectInstructionSD3> ttlInstdBalOptnPrtctInstrDtls;

    /**
     * Gets the value of the evtBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceSD5 }
     *     
     */
    public CorporateActionBalanceSD5 getEvtBalDtls() {
        return evtBalDtls;
    }

    /**
     * Sets the value of the evtBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceSD5 }
     *     
     */
    public DTCCCASTSD1V03 setEvtBalDtls(CorporateActionBalanceSD5 value) {
        this.evtBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlInstdBalOptnBalDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlInstdBalOptnBalDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInstdBalOptnBalDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionInstructedBalanceOptionBalanceSD3 }
     * 
     * 
     * @return
     *     The value of the ttlInstdBalOptnBalDtls property.
     */
    public List<CorporateActionInstructedBalanceOptionBalanceSD3> getTtlInstdBalOptnBalDtls() {
        if (ttlInstdBalOptnBalDtls == null) {
            ttlInstdBalOptnBalDtls = new ArrayList<>();
        }
        return this.ttlInstdBalOptnBalDtls;
    }

    /**
     * Gets the value of the ttlInstdBalOptnInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlInstdBalOptnInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInstdBalOptnInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionInstructedBalanceOptionInstructionSD3 }
     * 
     * 
     * @return
     *     The value of the ttlInstdBalOptnInstrDtls property.
     */
    public List<CorporateActionInstructedBalanceOptionInstructionSD3> getTtlInstdBalOptnInstrDtls() {
        if (ttlInstdBalOptnInstrDtls == null) {
            ttlInstdBalOptnInstrDtls = new ArrayList<>();
        }
        return this.ttlInstdBalOptnInstrDtls;
    }

    /**
     * Gets the value of the ttlInstdBalOptnPrtctInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlInstdBalOptnPrtctInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInstdBalOptnPrtctInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionInstructedBalanceOptionProtectInstructionSD3 }
     * 
     * 
     * @return
     *     The value of the ttlInstdBalOptnPrtctInstrDtls property.
     */
    public List<CorporateActionInstructedBalanceOptionProtectInstructionSD3> getTtlInstdBalOptnPrtctInstrDtls() {
        if (ttlInstdBalOptnPrtctInstrDtls == null) {
            ttlInstdBalOptnPrtctInstrDtls = new ArrayList<>();
        }
        return this.ttlInstdBalOptnPrtctInstrDtls;
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
     * Adds a new item to the ttlInstdBalOptnBalDtls list.
     * @see #getTtlInstdBalOptnBalDtls()
     * 
     */
    public DTCCCASTSD1V03 addTtlInstdBalOptnBalDtls(CorporateActionInstructedBalanceOptionBalanceSD3 ttlInstdBalOptnBalDtls) {
        getTtlInstdBalOptnBalDtls().add(ttlInstdBalOptnBalDtls);
        return this;
    }

    /**
     * Adds a new item to the ttlInstdBalOptnInstrDtls list.
     * @see #getTtlInstdBalOptnInstrDtls()
     * 
     */
    public DTCCCASTSD1V03 addTtlInstdBalOptnInstrDtls(CorporateActionInstructedBalanceOptionInstructionSD3 ttlInstdBalOptnInstrDtls) {
        getTtlInstdBalOptnInstrDtls().add(ttlInstdBalOptnInstrDtls);
        return this;
    }

    /**
     * Adds a new item to the ttlInstdBalOptnPrtctInstrDtls list.
     * @see #getTtlInstdBalOptnPrtctInstrDtls()
     * 
     */
    public DTCCCASTSD1V03 addTtlInstdBalOptnPrtctInstrDtls(CorporateActionInstructedBalanceOptionProtectInstructionSD3 ttlInstdBalOptnPrtctInstrDtls) {
        getTtlInstdBalOptnPrtctInstrDtls().add(ttlInstdBalOptnPrtctInstrDtls);
        return this;
    }

}

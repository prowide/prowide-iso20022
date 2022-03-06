
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.062.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctModCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1reda.062.001.01")
public class MxReda06200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesAcctModCxlReq", required = true)
    protected SecuritiesAccountModificationCancellationRequestV01 sctiesAcctModCxlReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 62;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, CancellationReason21 .class, CancellationReason35Choice.class, CancelledStatusReason11Code.class, DataModification1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, MarketSpecificAttribute1 .class, MxReda06200101 .class, NameAndAddress5 .class, PartyIdentification100 .class, PartyIdentification71Choice.class, PartyName2 .class, PostalAddress1 .class, PostalAddress9 .class, References22 .class, SecuritiesAccount19 .class, SecuritiesAccountModificationCancellationRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemParty2 .class, SystemPartyIdentification2 .class, SystemPartyModification1 .class, SystemPartyModification1Choice.class, SystemRestriction1 .class, TechnicalIdentification1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1reda.062.001.01";

    public MxReda06200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06200101(final String xml) {
        this();
        MxReda06200101 tmp = parse(xml);
        sctiesAcctModCxlReq = tmp.getSctiesAcctModCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctModCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountModificationCancellationRequestV01 }
     *     
     */
    public SecuritiesAccountModificationCancellationRequestV01 getSctiesAcctModCxlReq() {
        return sctiesAcctModCxlReq;
    }

    /**
     * Sets the value of the sctiesAcctModCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountModificationCancellationRequestV01 }
     *     
     */
    public MxReda06200101 setSctiesAcctModCxlReq(SecuritiesAccountModificationCancellationRequestV01 value) {
        this.sctiesAcctModCxlReq = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxReda06200101 parse(String xml) {
        return ((MxReda06200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06200101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06200101) parserImpl.read(MxReda06200101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxReda06200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06200101 message
     * @return
     *     a new instance of MxReda06200101
     */
    public final static MxReda06200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06200101 .class);
    }

}

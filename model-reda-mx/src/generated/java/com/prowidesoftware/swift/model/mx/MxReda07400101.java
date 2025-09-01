
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
 * Class for reda.074.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trptyCollUnltrlRmvlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.074.001.01")
public class MxReda07400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrptyCollUnltrlRmvlReq", required = true)
    protected TripartyCollateralUnilateralRemovalRequestV01 trptyCollUnltrlRmvlReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 74;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AlternatePartyIdentification7 .class, BlockChainAddressWallet3 .class, CollateralParties4 .class, CollateralRole1Code.class, DateOrDateTimePeriod3Choice.class, DateTimePeriod1 .class, FinancialInstrumentRemoval1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, MxReda07400101 .class, NameAndAddress5 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification232 .class, Period2 .class, Period4Choice.class, Period8Choice.class, PostalAddress1 .class, Reference21 .class, Removal1Choice.class, RemovalProcessing2Choice.class, RemovalTypeAndReason1 .class, RequestDetails28 .class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TripartyCollateralUnilateralRemovalRequestV01 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.074.001.01";

    public MxReda07400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda07400101(final String xml) {
        this();
        MxReda07400101 tmp = parse(xml);
        trptyCollUnltrlRmvlReq = tmp.getTrptyCollUnltrlRmvlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda07400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trptyCollUnltrlRmvlReq property.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralUnilateralRemovalRequestV01 }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 getTrptyCollUnltrlRmvlReq() {
        return trptyCollUnltrlRmvlReq;
    }

    /**
     * Sets the value of the trptyCollUnltrlRmvlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralUnilateralRemovalRequestV01 }
     *     
     */
    public MxReda07400101 setTrptyCollUnltrlRmvlReq(TripartyCollateralUnilateralRemovalRequestV01 value) {
        this.trptyCollUnltrlRmvlReq = value;
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
    public static MxReda07400101 parse(String xml) {
        return ((MxReda07400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda07400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda07400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda07400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda07400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda07400101 parse(String xml, MxRead parserImpl) {
        return ((MxReda07400101) parserImpl.read(MxReda07400101 .class, xml, _classes));
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
     * Creates an MxReda07400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda07400101 message
     * @return
     *     a new instance of MxReda07400101
     */
    public final static MxReda07400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda07400101 .class);
    }

}

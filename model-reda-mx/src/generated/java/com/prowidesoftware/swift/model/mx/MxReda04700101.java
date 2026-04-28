
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
 * Class for reda.047.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctyCSDLkStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.047.001.01")
public class MxReda04700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctyCSDLkStsAdvc", required = true)
    protected SecurityCSDLinkStatusAdviceV01 sctyCSDLkStsAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 47;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, CSDLinkStatus1 .class, DateAndDateTime2Choice.class, GenericIdentification36 .class, IdentificationSource3Choice.class, IssuerOrInvestor2Choice.class, MessageHeader12 .class, MxReda04700101 .class, NameAndAddress5 .class, OriginalBusinessInstruction1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, SecurityCSDLink9 .class, SecurityCSDLinkStatusAdviceV01 .class, SecurityIdentification19 .class, Status6Code.class, StatusReason6Choice.class, StatusReasonInformation10 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification2Choice.class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.047.001.01";

    public MxReda04700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04700101(final String xml) {
        this();
        MxReda04700101 tmp = parse(xml);
        sctyCSDLkStsAdvc = tmp.getSctyCSDLkStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctyCSDLkStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCSDLinkStatusAdviceV01 }
     *     
     */
    public SecurityCSDLinkStatusAdviceV01 getSctyCSDLkStsAdvc() {
        return sctyCSDLkStsAdvc;
    }

    /**
     * Sets the value of the sctyCSDLkStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCSDLinkStatusAdviceV01 }
     *     
     */
    public MxReda04700101 setSctyCSDLkStsAdvc(SecurityCSDLinkStatusAdviceV01 value) {
        this.sctyCSDLkStsAdvc = value;
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
    public static MxReda04700101 parse(String xml) {
        return ((MxReda04700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda04700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda04700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04700101 parse(String xml, MxRead parserImpl) {
        return ((MxReda04700101) parserImpl.read(MxReda04700101 .class, xml, _classes));
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
     * Creates an MxReda04700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04700101 message
     * @return
     *     a new instance of MxReda04700101
     */
    public final static MxReda04700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda04700101 .class);
    }

}

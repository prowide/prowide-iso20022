
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCANtfctnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.011.001.02")
public class MxSeev01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCANtfctnStsAdvc", required = true)
    protected AgentCANotificationStatusAdviceV02 agtCANtfctnStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCANotificationStatusAdviceV02 .class, AgentDocumentIdentificationAndStatus1Choice.class, AgentNotificationCancellationIdentificationAndStatus1 .class, AgentNotificationIdentificationAndStatus1 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType2Choice.class, CorporateActionEventType31Code.class, CorporateActionEventType84Choice.class, CorporateActionGeneralInformation171 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, FinancialInstrumentDescription4 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, MarketIdentification3Choice.class, MxSeev01100102 .class, NameAndAddress5 .class, NotificationAdviceStatus2Choice.class, NotificationCancellationProcessingStatus2 .class, NotificationCancellationRejectionReason2 .class, NotificationCancellationRequestStatus2Choice.class, NotificationProcessingStatus2 .class, NotificationRejectionReason2 .class, OtherIdentification1 .class, PartyIdentification129Choice.class, PostalAddress1 .class, ProcessedStatus1Format1Choice.class, ProcessedStatus2Code.class, ProcessedStatus2Format1Choice.class, ProcessedStatus7Code.class, RejectionReason11Format1Choice.class, RejectionReason6Format1Choice.class, RejectionReason80Code.class, RejectionReason81Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.011.001.02";

    public MxSeev01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01100102(final String xml) {
        this();
        MxSeev01100102 tmp = parse(xml);
        agtCANtfctnStsAdvc = tmp.getAgtCANtfctnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCANtfctnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCANotificationStatusAdviceV02 }
     *     
     */
    public AgentCANotificationStatusAdviceV02 getAgtCANtfctnStsAdvc() {
        return agtCANtfctnStsAdvc;
    }

    /**
     * Sets the value of the agtCANtfctnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCANotificationStatusAdviceV02 }
     *     
     */
    public MxSeev01100102 setAgtCANtfctnStsAdvc(AgentCANotificationStatusAdviceV02 value) {
        this.agtCANtfctnStsAdvc = value;
        return this;
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
    public static MxSeev01100102 parse(String xml) {
        return ((MxSeev01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev01100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01100102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01100102) parserImpl.read(MxSeev01100102 .class, xml, _classes));
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
     * Creates an MxSeev01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01100102 message
     * @return
     *     a new instance of MxSeev01100102
     */
    public static final MxSeev01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01100102 .class);
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

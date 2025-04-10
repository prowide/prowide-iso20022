
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
 * Class for seev.034.002.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.034.002.12")
public class MxSeev03400212
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStsAdvc", required = true)
    protected CorporateActionInstructionStatusAdvice002V12 corpActnInstrStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptedReason11Choice.class, AcceptedStatus9Choice.class, AcceptedStatusReason10 .class, AcknowledgementReason7Code.class, CancelledReason11Choice.class, CancelledStatus15Choice.class, CancelledStatusReason14 .class, CancelledStatusReason6Code.class, CashAccountIdentification6Choice.class, CorporateActionEventType103Choice.class, CorporateActionEventType34Code.class, CorporateActionGeneralInformation158 .class, CorporateActionInstructionStatusAdvice002V12 .class, CorporateActionNarrative19 .class, CorporateActionOption17Code.class, CorporateActionOption187 .class, CorporateActionOption42Choice.class, DocumentIdentification17 .class, DocumentIdentification34 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity31Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InstructionProcessingStatus44Choice.class, MxSeev03400212 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionFeatures12Code.class, OptionFeaturesFormat27Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PendingReason20Code.class, PendingReason61Choice.class, PendingStatus65Choice.class, PendingStatusReason23 .class, ProprietaryQuantity9 .class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, ProtectInstruction6 .class, ProtectInstructionStatus3Code.class, ProtectTransactionType2Code.class, Quantity10Choice.class, Quantity21Choice.class, RejectedReason40Choice.class, RejectedStatus40Choice.class, RejectedStatusReason38 .class, RejectionReason56Code.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat32Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.034.002.12";

    public MxSeev03400212() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03400212(final String xml) {
        this();
        MxSeev03400212 tmp = parse(xml);
        corpActnInstrStsAdvc = tmp.getCorpActnInstrStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03400212(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatusAdvice002V12 }
     *     
     */
    public CorporateActionInstructionStatusAdvice002V12 getCorpActnInstrStsAdvc() {
        return corpActnInstrStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatusAdvice002V12 }
     *     
     */
    public MxSeev03400212 setCorpActnInstrStsAdvc(CorporateActionInstructionStatusAdvice002V12 value) {
        this.corpActnInstrStsAdvc = value;
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
    public static MxSeev03400212 parse(String xml) {
        return ((MxSeev03400212) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03400212 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03400212 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03400212) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03400212 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03400212 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03400212) parserImpl.read(MxSeev03400212 .class, xml, _classes));
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
     * Creates an MxSeev03400212 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03400212 message
     * @return
     *     a new instance of MxSeev03400212
     */
    public final static MxSeev03400212 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03400212 .class);
    }

}

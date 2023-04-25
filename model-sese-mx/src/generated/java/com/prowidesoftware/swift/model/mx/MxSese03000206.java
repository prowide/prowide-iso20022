
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
 * Class for sese.030.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondsModReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.030.002.06")
public class MxSese03000206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondsModReq", required = true)
    protected SecuritiesSettlementConditionsModificationRequest002V06 sctiesSttlmCondsModReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptedReason12Choice.class, AcceptedStatus10Choice.class, AcceptedStatusReason11 .class, AcknowledgementReason8Code.class, AdditionalInformation12 .class, AutoBorrowing2Code.class, AutomaticBorrowing11Choice.class, CancellationReason16 .class, CancellationReason26Choice.class, CancelledStatus16Choice.class, CancelledStatusReason14Code.class, ClassificationType33Choice.class, DateAndDateTimeChoice.class, DocumentNumber16Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification163 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, HoldIndicator7 .class, IdentificationSource4Choice.class, LinkageType1Code.class, LinkageType4Choice.class, Linkages44 .class, MatchingDenied4Choice.class, MatchingProcess1Code.class, MxSese03000206 .class, NameAndAddress12 .class, NoReasonCode.class, OtherIdentification2 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification109 .class, PartyIdentification111 .class, PartyIdentification114Choice.class, PartyIdentificationAndAccount146 .class, PriorityNumeric5Choice.class, ProcessingPosition18Choice.class, ProcessingPosition4Code.class, ProcessingStatus59Choice.class, References21 .class, References54Choice.class, Registration12Choice.class, Registration2Code.class, RegistrationReason6 .class, RejectedStatus22Choice.class, RejectionReason29Choice.class, RejectionReason35 .class, RejectionReason40Code.class, RequestDetails16 .class, SecuritiesAccount30 .class, SecuritiesRTGS5Choice.class, SecuritiesSettlementConditionsModificationRequest002V06 .class, SecuritiesTransactionType5Code.class, SecurityIdentification20 .class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit4Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.030.002.06";

    public MxSese03000206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03000206(final String xml) {
        this();
        MxSese03000206 tmp = parse(xml);
        sctiesSttlmCondsModReq = tmp.getSctiesSttlmCondsModReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03000206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondsModReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionsModificationRequest002V06 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequest002V06 getSctiesSttlmCondsModReq() {
        return sctiesSttlmCondsModReq;
    }

    /**
     * Sets the value of the sctiesSttlmCondsModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionsModificationRequest002V06 }
     *     
     */
    public MxSese03000206 setSctiesSttlmCondsModReq(SecuritiesSettlementConditionsModificationRequest002V06 value) {
        this.sctiesSttlmCondsModReq = value;
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
    public static MxSese03000206 parse(String xml) {
        return ((MxSese03000206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03000206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03000206 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03000206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03000206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03000206 parse(String xml, MxRead parserImpl) {
        return ((MxSese03000206) parserImpl.read(MxSese03000206 .class, xml, _classes));
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
     * Creates an MxSese03000206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03000206 message
     * @return
     *     a new instance of MxSese03000206
     */
    public static final MxSese03000206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03000206 .class);
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

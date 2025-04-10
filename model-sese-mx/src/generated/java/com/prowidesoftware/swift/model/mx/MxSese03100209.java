
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
 * Class for sese.031.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.002.09")
public class MxSese03100209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdvice002V09 sctiesSttlmCondModStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason5Code.class, AutoBorrowing2Code.class, AutomaticBorrowing11Choice.class, BlockChainAddressWallet7 .class, DeniedReason17 .class, DeniedReason24Choice.class, DeniedReason6Code.class, DeniedStatus19Choice.class, DocumentNumber16Choice.class, GenericIdentification163 .class, GenericIdentification47 .class, GenericIdentification84 .class, HoldIndicator7 .class, LinkageType1Code.class, LinkageType4Choice.class, Linkages66 .class, MatchingDenied4Choice.class, MatchingProcess1Code.class, MxSese03100209 .class, NoReasonCode.class, PartyIdentification136Choice.class, PartyIdentification156 .class, PendingReason20 .class, PendingReason37Choice.class, PendingReason6Code.class, PendingStatus46Choice.class, PriorityNumeric5Choice.class, ProcessingPosition18Choice.class, ProcessingPosition4Code.class, ProcessingStatus91Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, References28 .class, References76Choice.class, Registration12Choice.class, Registration2Code.class, RegistrationReason6 .class, RejectionAndRepairReason41Choice.class, RejectionOrRepairReason41 .class, RejectionOrRepairStatus46Choice.class, RejectionReason71Code.class, RequestDetails29 .class, RestrictionIdentification2 .class, RestrictionReference1Code.class, SecuritiesAccount30 .class, SecuritiesRTGS5Choice.class, SecuritiesSettlementConditionModificationStatusAdvice002V09 .class, SecuritiesTransactionType5Code.class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit4Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.031.002.09";

    public MxSese03100209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100209(final String xml) {
        this();
        MxSese03100209 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdvice002V09 }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdvice002V09 getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdvice002V09 }
     *     
     */
    public MxSese03100209 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdvice002V09 value) {
        this.sctiesSttlmCondModStsAdvc = value;
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
    public static MxSese03100209 parse(String xml) {
        return ((MxSese03100209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03100209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03100209 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03100209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03100209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100209 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100209) parserImpl.read(MxSese03100209 .class, xml, _classes));
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
     * Creates an MxSese03100209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100209 message
     * @return
     *     a new instance of MxSese03100209
     */
    public static final MxSese03100209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03100209 .class);
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

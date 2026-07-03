
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.029.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntQryRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT6semt.029.001.01")
public class MxSemt02900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntQryRspn", required = true)
    protected IntraPositionMovementQueryResponseV01 intraPosMvmntQryRspn;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 29;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice1 .class, CancellationReason19Choice1 .class, CancellationReason91 .class, CancellationStatus14Choice1 .class, CancelledStatusReason13Code.class, DateAndDateTime2Choice1Draft.class, DocumentNumber5Choice1 .class, FailingReason3Code1 .class, FailingReason71 .class, FailingReason7Choice1 .class, FailingStatus9Choice1 .class, FinancialInstrumentQuantity1Choice1 .class, GenericIdentification301 .class, GenericIdentification371 .class, IntraPositionMovement71 .class, IntraPositionMovement81 .class, IntraPositionMovementQueryResponseV01 .class, IntraPositionMovements41 .class, IntraPositionReport41 .class, IntraPositionStatusAndReason21 .class, Linkages571Draft.class, Max4AlphaNumericTextFixed.class, Max4AlphaNumericTextFixed1 .class, MovementResponseType1Code.class, MxSemt02900101 .class, NoReasonCode.class, Pagination1 .class, PartyIdentification120Choice1 .class, PartyIdentification120Choice2 .class, PartyIdentification127Choice1 .class, PartyIdentification1361 .class, PartyIdentification1362 .class, PendingReason10Code1 .class, PendingReason141 .class, PendingReason26Choice1 .class, PendingStatus36Choice1 .class, PriorityNumeric4Choice1 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice1 .class, ProcessingStatus67Choice1 .class, ProprietaryReason41 .class, References34Choice1Draft.class, SecuritiesAccount191 .class, SecuritiesBalanceType11Code1 .class, SecuritiesBalanceType6Choice1 .class, SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft.class, SecurityIdentification191 .class, SettlementStatus16Choice1 .class, SystemPartyIdentification81 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT6semt.029.001.01";

    public MxSemt02900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02900101(final String xml) {
        this();
        MxSemt02900101 tmp = parse(xml);
        intraPosMvmntQryRspn = tmp.getIntraPosMvmntQryRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntQryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementQueryResponseV01 }
     *     
     */
    public IntraPositionMovementQueryResponseV01 getIntraPosMvmntQryRspn() {
        return intraPosMvmntQryRspn;
    }

    /**
     * Sets the value of the intraPosMvmntQryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementQueryResponseV01 }
     *     
     */
    public MxSemt02900101 setIntraPosMvmntQryRspn(IntraPositionMovementQueryResponseV01 value) {
        this.intraPosMvmntQryRspn = value;
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
    public static MxSemt02900101 parse(String xml) {
        return ((MxSemt02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02900101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02900101) parserImpl.read(MxSemt02900101 .class, xml, _classes));
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
     * Creates an MxSemt02900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02900101 message
     * @return
     *     a new instance of MxSemt02900101
     */
    public static final MxSemt02900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02900101 .class);
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

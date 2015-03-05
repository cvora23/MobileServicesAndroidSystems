// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - add the implementation
    // DONE - Finished the above TODO
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
        // DONE - Finished the above TODO
    	readWriteLock.writeLock().lock();
    	mValue = initialValue;
    	readWriteLock.writeLock().unlock();
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
        // TODO - you fill in here
        // DONE - Finished the above TODO
    	readWriteLock.readLock().lock();
    	long currentValue;
    	currentValue = mValue;
    	readWriteLock.readLock().unlock();
    	return currentValue;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
    public long decrementAndGet() {
        // TODO - you fill in here
        // DONE - Finished the above TODO

    	readWriteLock.writeLock().lock();
    	long updatedValue;
    	mValue--;
    	updatedValue = mValue;
    	readWriteLock.writeLock().unlock();
    	return updatedValue;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
    public long getAndIncrement() {
        // TODO - you fill in here
        // DONE - Finished the above TODO
    	
    	readWriteLock.writeLock().lock();
    	long previousValue;
    	previousValue = mValue;
    	mValue++;
    	readWriteLock.writeLock().unlock();
    	return previousValue;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
    public long getAndDecrement() {
        // TODO - you fill in here
        // DONE - Finished the above TODO

    	readWriteLock.writeLock().lock();
    	long previousValue;
    	previousValue = mValue;
    	mValue--;
    	readWriteLock.writeLock().unlock();
    	return previousValue;

    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
    public long incrementAndGet() {
        // TODO - you fill in here
    	readWriteLock.writeLock().lock();
    	long updatedValue;
    	mValue++;
    	updatedValue = mValue;
    	readWriteLock.writeLock().unlock();
    	return updatedValue;

    }
}

